package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Login;
import io.cucumber.java.en.*;
import io.cucumber.java.en_old.Ac;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utulities.ConfigReader;
import utulities.Driver;
import utulities.ReusableMethods;

public class KullaniciyiKaydetme {

    Login login= new Login();
    Actions actions=new Actions(Driver.getDriver());


    @Then("Signup-Login dugmesine tiklayin")
    public void signupLoginDugmesineTiklayin() {
        login.signUpButton.click();
    }


    @Then("{string} nin gorunur oldugunu dogrulayin")
    public void nin_gorunur_oldugunu_dogrulayin(String signHeader) throws InterruptedException {
        Thread.sleep(3000);
        Assert.assertEquals(signHeader,login.signHeader.getText());

    }
    @Then("Adi ve e-posta adresini girin")
    public void adi_ve_e_posta_adresini_girin() throws InterruptedException {
      Thread.sleep(3000);
       // ReusableMethods.waitForVisibility(login.signName,5);
        login.signName.sendKeys("aslı");
        //ReusableMethods.waitForVisibility(login.signEmail,5);
        login.signEmail.sendKeys("ad567@gmail.com");
        Thread.sleep(4000);


    }
    @Then("Kaydol dugmesini tiklayin")
    public void kaydol_dugmesini_tiklayin() {
       // ReusableMethods.waitForVisibility(login.signUpButton,3);
        login.signUpButtonu.click();

    }
    @Then("{string} ifadesinin gorundugunu dogrulayin")
    public void ifadesinin_gorundugunu_dogrulayin(String hesapBilgileriHeader) throws InterruptedException {
        //ReusableMethods.waitForVisibility(login.hesapBilgileriHeader,4);
        Thread.sleep(3000);
        Assert.assertEquals(hesapBilgileriHeader,login.hesapBilgileriHeader.getText());

    }


    @Then("Ayrintilari doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi")
    public void ayrintilari_doldurun_unvan_ad_e_posta_parola_doğum_tarihi() throws InterruptedException {
        Thread.sleep(3000);
        login.radioButton.click();
        Thread.sleep(4000);




        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("12234").sendKeys(Keys.TAB).sendKeys("3").
                sendKeys(Keys.TAB).sendKeys("J").sendKeys(Keys.TAB).sendKeys("1").perform();


    }
    @Then("Bultenimize kaydolun! onay kutusunu seçin.")
    public void bultenimize_kaydolun_onay_kutusunu_seçin() throws InterruptedException {
        Thread.sleep(3000);


        login.checkbox.get(0).click();


    }
    @Then("Ortaklarimizdan özel teklifler alin! onay kutusunu seçin.")
    public void ortaklarimizdan_özel_teklifler_alin_onay_kutusunu_seçin() {



        login.checkbox.get(1).click();

    }
    @Then("Ayrintilari doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarasi")
    public void ayrintilari_doldurun_ad_soyad_şirket_adres_adres2_ülke_eyalet_şehir_posta_kodu_cep_numarasi() {
        actions.sendKeys(Keys.TAB,"aslı").sendKeys(Keys.TAB,"Dalan").sendKeys(Keys.TAB,"annonim a.ş").
                sendKeys(Keys.TAB,"başgar caddesi no:43 İstanbul/Bağcılar",Keys.TAB,"lale sok. no:54 İstanbul/Şile",
                        Keys.TAB,"Turkiye",Keys.TAB ,"Marmara",Keys.TAB,"İstanbul",Keys.TAB,"34100",Keys.TAB,"4535678993").perform();

    }
    @Then("Hesap Olustur dugmesini tiklayin")
    public void hesap_olustur_dugmesini_tiklayin() throws InterruptedException {
        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
       login.createAccountButton.click();


    }
    @Then("HESAP OLUŞTURULDU! yazisinin görünür oldugunu dogrulayin")
    public void hesap_oluşturuldu_yazisinin_görünür_oldugunu_dogrulayin() {

        if (login.AccountCreatedText.isDisplayed()){

            Assert.assertTrue(login.AccountCreatedText.isDisplayed());
        }else {
            Driver.getDriver().switchTo().frame(login.frame).findElement(By.xpath("//*[@id='dismiss-button']")).click();
            Driver.getDriver().switchTo().defaultContent();
        }






    }
    @Then("Devam Et dugmesini tiklayin")
    public void devam_et_dugmesini_tiklayin() {
        login.continueButton.click();

    }
    @Then("Kullanici adi olarak oturum acildi ifadesinin gorunur oldugunu dogrulayin")
    public void kullanici_adi_olarak_oturum_acildi_ifadesinin_gorunur_oldugunu_dogrulayin() throws InterruptedException {
        Thread.sleep(5000);
        Assert.assertTrue(login.loggedText.isDisplayed());

    }


    @Then("Sayfayı Kapatır")
    public void sayfayıKapatır() throws InterruptedException {
        Driver.closeDriver();

    }
}
