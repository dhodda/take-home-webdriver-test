package dotdash.automation.tests;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/features/", glue = {"src/test/java/dotdash/automation/tests"},
        monochrome = true, plugin = {"pretty", "html:build/htmlReports"})
public class CucumberRunner {
}
