package Runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import io.cucumber.plugin.Plugin;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumber-reports.html"},
        features = "C:\\com.automationexercise-CucumberProje\\src\\test\\resources\\Features",
        glue="StepDefinitions",
        tags="@AboneEmailIslemi",
        dryRun = false

)



public class runners {

}
