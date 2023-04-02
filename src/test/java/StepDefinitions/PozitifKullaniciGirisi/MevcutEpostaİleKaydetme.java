package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Login;
import Pages.SignUpLogin;
import io.cucumber.java.en.Then;
import org.junit.Assert;

public class MevcutEpostaİleKaydetme {
   Login login=new Login();
   SignUpLogin signUpLogin=new SignUpLogin();
    @Then("Adi ve kayitli e-posta adresini girin")
    public void adi_ve_kayitli_e_posta_adresini_girin() {
        login.signName.sendKeys("Aslı");
        login.signEmail.sendKeys("ad567@gmail.com");



    }
    @Then("E-posta Adresi zaten mevcut! hatasını doğrulayın")
    public void hatasını_doğrulayın_görünür() {
        String exceptionMesaj="Email Address already exist!";
        String actualMesaj= signUpLogin.tanimliEmailUyariMesaji.getText();
        Assert.assertEquals(exceptionMesaj,actualMesaj);


    }
}
