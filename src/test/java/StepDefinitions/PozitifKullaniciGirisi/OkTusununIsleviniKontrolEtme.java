package StepDefinitions.PozitifKullaniciGirisi;

import Pages.MainPage;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.Driver;
import utulities.ReusableMethods;

public class OkTusununIsleviniKontrolEtme {
    MainPage mainPage=new MainPage();


    @And("Yukarı doğru hareket etmek için sağ alt taraftaki oka tıklayın")
    public void yukarıDoğruHareketEtmekIçinSağAltTaraftakiOkaTıklayın() {
        Driver.getDriver().switchTo().frame(mainPage.iframe);
        mainPage.iframe.click();
        Driver.getDriver().switchTo().defaultContent();
        mainPage.yukariOkTusu.click();

    }


    @And("Sayfanın yukarı kaydırıldığını ve Otomasyon Mühendisleri için Tam Teşekküllü uygulama web sitesi metninin ekranda göründüğünü doğrulayın")
    public void sayfanınYukarıKaydırıldığınıVeOtomasyonMühendisleriIçinTamTeşekküllüUygulamaWebSitesiMetnininEkrandaGöründüğünüDoğrulayın() {
       Assert.assertTrue( ReusableMethods.textislemleri("Full-Fledged practice website for Automation Engineers").isDisplayed());

    }
}
