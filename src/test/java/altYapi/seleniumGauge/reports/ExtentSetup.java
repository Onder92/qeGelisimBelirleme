package altYapi.seleniumGauge.reports;

import com.thoughtworks.gauge.BeforeScenario;
import com.thoughtworks.gauge.AfterScenario;
import com.thoughtworks.gauge.ExecutionContext;

public class ExtentSetup {

    @BeforeScenario
    public void beforeScenario(ExecutionContext context) {
        String scenarioName = context.getCurrentScenario().getName();
        ExtentManager.startTest(scenarioName);
    }

    @AfterScenario
    public void afterScenario(ExecutionContext context) {
        if (context.getCurrentScenario().getIsFailing()) {
            ExtentManager.setTestStatusFail("Scenario failed: " + context.getCurrentScenario().getName());
        }
        ExtentManager.flushReports();
    }
}
