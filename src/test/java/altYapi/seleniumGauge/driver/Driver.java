package altYapi.seleniumGauge.driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.BeforeScenario;
import org.openqa.selenium.firefox.FirefoxOptions;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class Driver {

    private static WebDriver driver;
    private static String baseUrl;

    @BeforeScenario
    public static void initialize() {
        if (driver != null) {
            return;
        }

        Properties properties = new Properties();
        try (FileInputStream fis = new FileInputStream("src/test/resources/configuration.properties")) {
            properties.load(fis);
        } catch (IOException e) {
            throw new RuntimeException("Failed to load configuration properties", e);
        }

        String browser = properties.getProperty("browser", "chrome");
        baseUrl = properties.getProperty("baseUrl", "https://example.com");

        switch (browser.toLowerCase()) {
            case "chrome":
                System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chrome/chromedriver");
                driver = new ChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver", "src/test/resources/drivers/firefox/geckodriver");
                FirefoxOptions options = new FirefoxOptions();
                driver = new FirefoxDriver(options);
                break;
            case "edge":
                System.setProperty("webdriver.edge.driver", "src/test/resources/drivers/edge/msedgedriver");
                driver = new EdgeDriver();
                break;
            default:
                throw new IllegalArgumentException("Browser not supported: " + browser);
        }

        driver.manage().window().maximize();
        navigateToBaseUrl();
    }

 /*   @AfterScenario
    public static void quitDriver() {
        if (driver != null) {
            driver.quit();
            driver = null;
        }
    }*/

    public static WebDriver getDriver() {
        if (driver == null) {
            initialize();
        }
        return driver;
    }

    public static void navigateToBaseUrl() {
        if (driver == null) {
            throw new IllegalStateException("Driver is not initialized. Please check your setup.");
        }
        driver.get(baseUrl);
    }

    public static String getBaseUrl() {
        return baseUrl;
    }
}
