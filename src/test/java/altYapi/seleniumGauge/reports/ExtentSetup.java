package altYapi.seleniumGauge.reports;

import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.ExecutionContext;

public class ExtentSetup {

    @BeforeScenario
    public void beforeScenario(ExecutionContext context) {
        // Senaryonun adını otomatik al
        String scenarioName = context.getCurrentScenario().getName();
        ExtentManager.startTest(scenarioName);
    }

    @AfterScenario
    public void afterScenario(ExecutionContext context) {
        // Senaryo fail mi?
        if (context.getCurrentScenario().getIsFailing()) {
            ExtentManager.setTestStatusFail("Scenario failed!");
        } else {
            // Opsiyonel: Pass olarak işaretleyebilirsiniz
            ExtentManager.setTestStatusPass("Scenario passed!");
        }

        // Raporu finalize et
        ExtentManager.flushReports();
    }
}
