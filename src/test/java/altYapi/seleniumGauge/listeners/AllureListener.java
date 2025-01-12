package altYapi.seleniumGauge.listeners;

import io.qameta.allure.Allure;
import io.qameta.allure.AllureLifecycle;
import io.qameta.allure.junit4.AllureJunit4;
import io.qameta.allure.model.TestResult;
import org.junit.runner.Description;

import java.util.UUID;

public class AllureListener extends AllureJunit4 {

    // Her test için oluşturduğumuz benzersiz ID
    private String testUuid;

    @Override
    public void testStarted(Description description) {
        // JUnit4'ün TestWatcher fonksiyonelliğini kullanmak için
        super.testStarted(description);

        String testName = description.getMethodName();
        String className = description.getClassName();

        // Allure raporuna eklemek istediğimiz test bilgileri
        TestResult testResult = new TestResult()
                .setName(testName)
                .setFullName(className + "." + testName);

        // Rastgele bir UUID atıyoruz (her test için farklı olsun diye)
        testUuid = UUID.randomUUID().toString();

        // Allure Lifecycle nesnesini alalım
        AllureLifecycle lifecycle = Allure.getLifecycle();

        // 1) Testi "planla" (schedule)
        lifecycle.scheduleTestCase(testUuid, testResult);

        // 2) Planladığımız testi başlat
        lifecycle.startTestCase(testUuid);

        // (Opsiyonel) Test adını update edebilirsiniz
        lifecycle.updateTestCase(testUuid, tr -> tr.setName(testName));
    }

    @Override
    public void testFinished(Description description) {
        // JUnit4'ün TestWatcher fonksiyonelliğini kullanmak için
        super.testFinished(description);

        try {
            AllureLifecycle lifecycle = Allure.getLifecycle();

            // 3) Testi durdur
            lifecycle.stopTestCase(testUuid);

            // 4) Testi rapor dosyasına yaz
            lifecycle.writeTestCase(testUuid);

        } catch (Exception e) {
            System.err.println("Error stopping the test case: " + e.getMessage());
        }
    }
}
