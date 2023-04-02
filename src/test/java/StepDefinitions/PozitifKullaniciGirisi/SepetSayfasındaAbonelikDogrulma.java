package StepDefinitions.PozitifKullaniciGirisi;

import Pages.MainPage;
import io.cucumber.gherkin.Main;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import utulities.ReusableMethods;

public class SepetSayfasındaAbonelikDogrulma {

   MainPage mainPage=new MainPage();
    @And("Sepet düğmesine tıklayın")
    public void sepetDüğmesineTıklayın() throws InterruptedException {
        Thread.sleep(3000);
        mainPage.cartButonu.click();

    }
}
