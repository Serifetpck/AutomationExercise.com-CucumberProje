package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html",
                "json:target/json-reports/cucumber.json",
                "junit:target/xml-report/cucumber.xml" },
        features = "C:\\com.automationexercise-CucumberProje\\src\\test\\resources\\Features",
        glue="StepDefinitions",
        tags="@AboneEmailIslemi",
        dryRun = false

)

public class TestRunner {
}
