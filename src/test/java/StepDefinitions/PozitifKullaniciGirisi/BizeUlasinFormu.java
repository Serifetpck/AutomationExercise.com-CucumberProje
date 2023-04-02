package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Contact_Us;
import Pages.Login;
import Pages.MainPage;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utulities.Driver;
import utulities.ReusableMethods;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class BizeUlasinFormu {
  Contact_Us contact_us=new Contact_Us();
  MainPage mainPage=new MainPage();
    Actions actions=new Actions(Driver.getDriver());

    @Then("Bize Ulasin dugmesine tiklayin")
    public void bizeUlasinDugmesineTiklayin() throws InterruptedException {
        ReusableMethods.anasyfaGirisBaslıkları("contact_us").click();

    }


    @Then("ILETISIME GECİN ifadesinin gorunur oldugunu dogrulayin")
    public void ıletısımeGECİNIfadesininGorunurOldugunuDogrulayin() {
        Assert.assertTrue(ReusableMethods.textislemleri("Get In Touch").isDisplayed());
    }



    @Then("Adi, e-postayi, konuyu ve mesaji girin")
    public void adiEPostayiKonuyuVeMesajiGirin() {
        ReusableMethods.contactForm("Name").sendKeys("Aslı");
        ReusableMethods.contactForm("Email").sendKeys("ad567@gmail.com");
        ReusableMethods.contactForm("Subject").sendKeys("Sayfa yuklenemedi mesaji aliyorum yardimci olabilir misiniz?");

    }

    @Then("Dosya yukleyin")
    public void dosyaYukleyin()  {

       //String dosyaYolu="\"C:\\Users\\Serife\\Desktop\\ulkeler.xlsx\"";

       //contact_us.dosyaSecButtonu.sendKeys(dosyaYolu);









    }

    @Then("Gonder dugmesini tiklayin")
    public void gonderDugmesiniTiklayin() throws InterruptedException {
        Thread.sleep(4000);
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        contact_us.submitButtonu.click();
    }

    @Then("Tamam dugmesine tiklayin")
    public void tamamDugmesineTiklayin() {
        Driver.getDriver().switchTo().alert().accept();

    }

    @Then("Basari mesajini dogrulayin Bilgileriniz başariyla gonderildi.")
    public void basariMesajiniDogrulayinBilgilerinizBaşariylaGonderildi() {
        Assert.assertTrue(ReusableMethods.textislemleri("Success! Your details have been submitted successfully.").isDisplayed());
    }

    @Then("Ana Sayfa dugmesine tiklayin ve ana sayfaya basariyla geldigini dogrulayin")
    public void anaSayfaDugmesineTiklayinVeAnaSayfayaBasariylaGeldiginiDogrulayin() throws InterruptedException {

        Thread.sleep(3000);
        actions.sendKeys(Keys.PAGE_UP).perform();
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();",  contact_us.returnHomeButtonu);

       Assert.assertTrue(mainPage.testCasesButton.isDisplayed());

    }
}