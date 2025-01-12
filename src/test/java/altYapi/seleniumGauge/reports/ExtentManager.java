package altYapi.seleniumGauge.reports;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class ExtentManager {

    private static ExtentReports extent;
    private static ExtentTest currentTest;

    public static ExtentReports getExtentReports() {
        if (extent == null) {
            ExtentHtmlReporter htmlReporter = new ExtentHtmlReporter("extent-report.html");
            extent = new ExtentReports();
            extent.attachReporter(htmlReporter);

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

    public static void attachScreenshot(byte[] screenshot) {
        if (currentTest != null && screenshot != null) {
            String base64 = java.util.Base64.getEncoder().encodeToString(screenshot);
            currentTest.addScreenCaptureFromBase64String(base64, "Screenshot");
        }
    }

    public static void setTestStatusFail(String details) {
        if (currentTest != null) {
            currentTest.fail(details);
        }
    }

    public static void flushReports() {
        if (extent != null) {
            extent.flush();
        }
    }
}
