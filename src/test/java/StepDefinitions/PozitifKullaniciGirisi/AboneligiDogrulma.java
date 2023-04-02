package StepDefinitions.PozitifKullaniciGirisi;

import Pages.MainPage;
import io.cucumber.java.en.And;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import utulities.Driver;
import utulities.ReusableMethods;

public class AboneligiDogrulma {
    MainPage mainPage=new MainPage();

    @And("Alt Bilgiye doğru aşağı kaydırın")
    public void altBilgiyeDoğruAşağıKaydırın() throws InterruptedException {
        Thread.sleep(2000);
       WebElement abonelikbasligi= ReusableMethods.textislemleri("Subscription");
       ReusableMethods.sayfayıAsagıDogruKaydırma(abonelikbasligi);

    }
    @And("{string} metnini doğrulayın")
    public void abonelikMetniniDoğrulayın(String abonelik) throws InterruptedException {
        Thread.sleep(2000);
        String abonelikbasligi= ReusableMethods.textislemleri("Subscription").getText();
        Assert.assertEquals(abonelik,abonelikbasligi);

    }

    @And("Giriş alanına e-posta adresini girin ve ok düğmesine tıklayın")
    public void girişAlanınaEPostaAdresiniGirinVeOkDüğmesineTıklayın() throws InterruptedException {
        Thread.sleep(2000);
        mainPage.aboneEmailSearch.sendKeys("ad567@gmail.com", Keys.ENTER);
        ReusableMethods.waitForVisibility(ReusableMethods.textislemleri("You have been successfully subscribed!"),5000);
        Assert.assertTrue(ReusableMethods.textislemleri("You have been successfully subscribed!").isDisplayed());

    }

    @And("Başarı mesajını doğrulayın {string} görünür olmalı")
    public void başarıMesajınıDoğrulayınBaşarıylaAboneOldunuzGörünürOlmalı(String abone) {



    }
}
