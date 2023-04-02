package StepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import utulities.Driver;

public class WebGiris {
    @Given("Tarayiciyi baslatin")
    public void tarayiciyi_baslatin() {
        // Driver.getDriver().get(ConfigReader.getProperty("browser"));


    }

    @Then("Sayfanin web URL'sine gidin")
    public void sayfanin_web_url_sine_gidin() {

        Driver.getDriver().get("https://automationexercise.com");


    }

    @Then("Ana sayfanin basariyla göründüğünü dogrulayin")
    public void ana_sayfanin_basariyla_göründüğünü_dogrulayin() {
        String actualUrl= Driver.getDriver().getCurrentUrl();
        String expectedUrl="https://automationexercise.com/";
        Assert.assertEquals(expectedUrl,actualUrl);

    }
}
