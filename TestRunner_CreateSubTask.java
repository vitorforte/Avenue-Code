package testRunners;

import org.junit.runner.RunWith;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(
		features="resources/features/CreateSubTask.feature", 
		glue="stepDefinitions",
		format= {"pretty"},
		monochrome = true,
		strict = true,
		dryRun = false
		)

public class TestRunner_CreateSubTask {

}
