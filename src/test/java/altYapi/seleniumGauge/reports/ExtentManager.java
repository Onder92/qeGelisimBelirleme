package altYapi.seleniumGauge.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest currentTest;

    // Tek seferlik ExtentReports nesnesi
    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);

            // İsteğe bağlı sistem bilgileri
            extent.setSystemInfo("Env", "Local");
            extent.setSystemInfo("Browser", "Chrome");
        }
        return extent;
    }

    // Senaryo başlarken test oluştur
    public static void startTest(String testName) {
        getExtentReports();
        currentTest = extent.createTest(testName);
    }

    // Extent'e log ekleme
    public static void logInfo(String message) {
        if (currentTest != null) {
            currentTest.info(message);
        }
    }

    // Ekran görüntüsünü rapora ekleme
    public static void attachScreenshot(byte[] screenshot) {
        if (currentTest != null && screenshot != null) {
            String base64 = java.util.Base64.getEncoder().encodeToString(screenshot);
            currentTest.addScreenCaptureFromBase64String(base64, "Screenshot");
        }
    }

    // Fail olarak işaretleme
    public static void setTestStatusFail(String details) {
        if (currentTest != null) {
            currentTest.fail(details);
        }
    }

    // Pass olarak işaretleme (opsiyonel)
    public static void setTestStatusPass(String details) {
        if (currentTest != null) {
            currentTest.pass(details);
        }
    }

    // Raporu finalize et
    public static void flushReports() {
        if (extent != null) {
            extent.flush();
        }
    }
}
