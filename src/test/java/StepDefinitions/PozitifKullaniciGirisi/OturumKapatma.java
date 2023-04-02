package StepDefinitions.PozitifKullaniciGirisi;

import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.ReusableMethods;

public class OturumKapatma {

    @Then("Çıkıs dugmesini tiklayin")
    public void çıkıs_dugmesini_tiklayin() throws InterruptedException {
        ReusableMethods.anasyfaGirisBaslıkları("logout").click();

    }
    @Then("Kullanıcının oturum açma sayfasına yönlendirildiğini doğrulayın")
    public void kullanıcının_oturum_açma_sayfasına_yönlendirildiğini_doğrulayın() throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertTrue(ReusableMethods.textislemleri("Login to your account").isDisplayed());

    }


}
