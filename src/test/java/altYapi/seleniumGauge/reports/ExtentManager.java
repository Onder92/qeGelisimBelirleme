package altYapi.seleniumGauge.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest currentTest;

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentSparkReporter sparkReporter = new ExtentSparkReporter("test-output/extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(sparkReporter);

            extent.setSystemInfo("Env", "Local");
            extent.setSystemInfo("Browser", "Chrome");
        }
        return extent;
    }

    public static void startTest(String testName) {
        getExtentReports();
        currentTest = extent.createTest(testName);
    }

    public static void logInfo(String message) {
        if (currentTest != null) {
            currentTest.info(message);
        }
    }

    public static void setTestStatusFail(String details) {
        if (currentTest != null) {
            currentTest.fail(details);  // Artık detaylı hata mesajı rapora eklenecek
        }
    }
    public static void attachScreenshot(String base64Screenshot) {
        if (currentTest != null && base64Screenshot != null) {
            System.out.println("DEBUG: Ekran görüntüsü rapora ekleniyor...");
            currentTest.addScreenCaptureFromBase64String(base64Screenshot, "Ekran Görüntüsü");
        } else {
            System.out.println("DEBUG: Ekran görüntüsü rapora eklenemedi!");
        }
    }

    public static void flushReports() {
        if (extent != null) {
            System.out.println("DEBUG: Rapor güncelleniyor...");
            extent.flush();
        }
    }

}
