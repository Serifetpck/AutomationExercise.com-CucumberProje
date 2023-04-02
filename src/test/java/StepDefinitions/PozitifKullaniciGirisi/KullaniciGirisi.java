package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Login;
import Pages.MainPage;
import Pages.SignUpLogin;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.ReusableMethods;

public class KullaniciGirisi {

    MainPage anasayfa=new MainPage();
    SignUpLogin signUpLogin=new SignUpLogin();
    Login login=new Login();
    @Then("Kaydol-Giriş Yap dugmesine tiklayin")
    public void kaydol_giriş_yap_dugmesine_tiklayin() {
        anasayfa.KullanıcıGirisi.click();


    }
    @Then("Hesabiniza giris yapinin gorundugunu dogrulayin")
    public void hesabiniza_giris_yapinin_gorundugunu_dogrulayin() {
        Assert.assertTrue(ReusableMethods.textislemleri("Login to your account").isDisplayed());

    }
    @Then("Dogru e-posta adresini ve sifreyi girin")
    public void dogru_e_posta_adresini_ve_sifreyi_girin() throws InterruptedException {
        Thread.sleep(3000);
        ReusableMethods.senkeys(signUpLogin.loginEmailButtonu,"ad567@gmail.com");
        ReusableMethods.senkeys(signUpLogin.loginPasswordButtonu,"12234");



    }
    @Then("Giris dugmesine tiklayin")
    public void giris_dugmesine_tiklayin() {
        signUpLogin.LoginButtonu.click();


    }
    @Then("-Kullanici adi olarak oturum acildi- ifadesinin görünür olduğunu doğrulayın")
    public void ifadesinin_görünür_olduğunu_doğrulayın() {
        Assert.assertTrue(login.loggedText.isDisplayed());

    }
    @Then("Hesabi Sil dugmesini tiklayin")
    public void hesabi_sil_dugmesini_tiklayin() {


    }
    @Then("HESAP SİLİNDİ! textininin gorunur oldugunu dogrulayin")
    public void hesap_silindi_textininin_gorunur_oldugunu_dogrulayin() {

    }
}
