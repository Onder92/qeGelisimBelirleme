package altYapi.seleniumGauge.step;

import altYapi.seleniumGauge.driver.Driver;
import altYapi.seleniumGauge.reports.ExtentManager;
import altYapi.seleniumGauge.utils.JsonUtils;
import com.thoughtworks.gauge.Step;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public class StepImplementation {

    private final Logger logger = LoggerFactory.getLogger(StepImplementation.class);
    private final WebDriver driver = Driver.getDriver();
    private final Map<String, String> storedTexts = new HashMap<>();

    // Tek bir element bulma metodu
    private WebElement findElement(String key) {
        JsonUtils.ElementLocator elementLocator = JsonUtils.getElementLocator(key);
        if (elementLocator == null) {
            throw new IllegalArgumentException("Key için bir element bulunamadı: " + key);
        }

        By by;
        switch (elementLocator.getType().toLowerCase()) {
            case "xpath":
                by = By.xpath(elementLocator.getLocator());
                break;
            case "css":
                by = By.cssSelector(elementLocator.getLocator());
                break;
            case "id":
                by = By.id(elementLocator.getLocator());
                break;
            default:
                throw new IllegalArgumentException("Geçersiz locator türü: " + elementLocator.getType());
        }
        return driver.findElement(by);
    }

    // Birden fazla elementi bulma metodu
    private List<WebElement> findElements(String key) {
        JsonUtils.ElementLocator elementLocator = JsonUtils.getElementLocator(key);
        if (elementLocator == null) {
            throw new IllegalArgumentException("Key için bir element bulunamadı: " + key);
        }

        By by;
        switch (elementLocator.getType().toLowerCase()) {
            case "xpath":
                by = By.xpath(elementLocator.getLocator());
                break;
            case "css":
                by = By.cssSelector(elementLocator.getLocator());
                break;
            case "id":
                by = By.id(elementLocator.getLocator());
                break;
            default:
                throw new IllegalArgumentException("Geçersiz locator türü: " + elementLocator.getType());
        }
        return driver.findElements(by);
    }

    // Ortak log metodu: Hem console'a hem de Extent raporuna
    private void log(String message) {
        logger.info(message);                // Konsola yaz
        ExtentManager.logInfo(message);      // Extent raporuna yaz
    }

    // Bekleme metodu
    @Step("<second> saniye bekle")
    public void waitElement(int second) throws InterruptedException {
        log("Bekleniyor: " + second + " saniye");
        Thread.sleep(second * 1000);
    }

    // Elemente tıklama metodu
    @Step("<key> elementine tıkla")
    public void clickElement(String key) {
        WebElement element = findElement(key);
        element.click();
        log("Elemente tıklandı: " + key);
    }

    // Elemente text yazma metodu
    @Step("<key> elementine <value> değerini yaz")
    public void sendKeysToElement(String key, String value) {
        WebElement element = findElement(key);
        element.sendKeys(value);
        log("Elemente değer yazıldı: " + key + ", Değer: " + value);
    }

    // Element görünürlüğünü kontrol etme
    @Step("<key> elementinin görünür olduğunu kontrol et")
    public void checkElementVisibility(String key) {
        WebElement element = findElement(key);
        if (!element.isDisplayed()) {
            ExtentManager.attachScreenshot(captureScreenshot());
            throw new AssertionError("Element görünür değil: " + key);
        }
        log("Element görünür: " + key);
    }

    // Elementin değerini temizleme metodu
    @Step("<key> elementinin değerini temizle")
    public void clearElement(String key) {
        WebElement element = findElement(key);
        element.clear();
        log("Elementin değeri temizlendi: " + key);
    }

    // Elemente JavaScript ile tıklama
    @Step("<key> elementine javascript ile tıkla")
    public void clickElementUsingJs(String key) {
        WebElement element = findElement(key);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].click();", element);
        log("Elemente JavaScript ile tıklandı: " + key);
    }

    // JavaScript ile text yazma
    @Step("<key> elementine javascript ile <value> değerini yaz")
    public void sendKeysUsingJs(String key, String value) {
        WebElement element = findElement(key);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].value = arguments[1];", element, value);
        log("JavaScript ile değer yazıldı: " + key + ", Değer: " + value);
    }

    // Rastgele bir element seçme ve tıklama
    @Step("<key> elementlerinden rastgele birini seç")
    public void selectRandomElement(String key) {
        List<WebElement> elements = findElements(key);
        if (elements.isEmpty()) {
            throw new IllegalArgumentException("Hiçbir element bulunamadı: " + key);
        }

        Random random = new Random();
        WebElement randomElement = elements.get(random.nextInt(elements.size()));
        randomElement.click();
        log("Rastgele bir element seçildi ve tıklandı: " + key);
    }

    // Elementin bulunduğu alana kaydırma
    @Step("Sayfayı <key> elementine kaydır")
    public void scrollToElement(String key) {
        WebElement element = findElement(key);
        JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
        jsExecutor.executeScript("arguments[0].scrollIntoView(true);", element);
        log("Sayfa " + key + " elementine kaydırıldı.");
    }

    // Elementin varlığını kontrol etme
    @Step("<key> elementinin var olduğunu kontrol et")
    public void checkElementExists(String key) {
        List<WebElement> elements = findElements(key);
        if (elements.isEmpty()) {
            ExtentManager.attachScreenshot(captureScreenshot());
            throw new AssertionError("Element mevcut değil: " + key);
        }
        log("Element mevcut: " + key);
    }

    // Elementin text değerini doğrulama
    @Step("<key> elementinin text değeri <expectedText> ile eşit mi kontrol et")
    public void verifyElementText(String key, String expectedText) {
        WebElement element = findElement(key);
        String actualText = element.getText();

        if (!actualText.equals(expectedText)) {
            ExtentManager.attachScreenshot(captureScreenshot());
            throw new AssertionError("Elementin text değeri beklenenle eşleşmiyor. Beklenen: '"
                    + expectedText + "', Gerçek: '" + actualText + "'");
        }
        log("Elementin text değeri beklenenle eşleşiyor: " + expectedText);
    }

    // Elementin text değerini kaydetme
    @Step("<key> elementinin text değerini <identifier> olarak kaydet")
    public void storeElementText(String key, String identifier) {
        WebElement element = findElement(key);
        String text = element.getText();
        storedTexts.put(identifier, text);
        log("Elementin text değeri kaydedildi. Identifier: " + identifier + ", Text: " + text);
    }

    // Kaydedilen text ile karşılaştırma
    @Step("<key> elementinin text değerini kaydedilen <identifier> text değeri ile karşılaştır")
    public void compareElementTextWithStored(String key, String identifier) {
        WebElement element = findElement(key);
        String actualText = element.getText();
        String storedText = storedTexts.get(identifier);

        if (storedText == null) {
            ExtentManager.attachScreenshot(captureScreenshot());
            throw new IllegalArgumentException("Identifier için kaydedilmiş bir text değeri bulunamadı: " + identifier);
        }

        if (!actualText.equals(storedText)) {
            ExtentManager.attachScreenshot(captureScreenshot());
            throw new AssertionError("Elementin text değeri kaydedilen text değeri ile eşleşmiyor. Kaydedilen: '"
                    + storedText + "', Gerçek: '" + actualText + "'");
        }
        log("Elementin text değeri kaydedilen text değeri ile eşleşiyor. Identifier: " + identifier);
    }

    // Ekran görüntüsü alma (ExtentManager.attachScreenshot(...) bu metodu kullanıyor)
    public byte[] captureScreenshot() {
        return ((TakesScreenshot) driver).getScreenshotAs(OutputType.BYTES);
    }
}
