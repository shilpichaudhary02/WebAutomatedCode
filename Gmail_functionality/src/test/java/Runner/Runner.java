package Runner;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "TestScenarios", glue = "/src/test/java/StepDefinition/compose_functionality.java", tags = {
		"@compose" }, monochrome = true)
public class Runner {
}
