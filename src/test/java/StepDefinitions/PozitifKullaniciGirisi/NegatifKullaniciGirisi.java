package StepDefinitions.PozitifKullaniciGirisi;

import Pages.SignUpLogin;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.ReusableMethods;

public class NegatifKullaniciGirisi {


    SignUpLogin signUpLogin=new SignUpLogin();
    @Then("Yanlış e-posta adresi ve şifre girin")
    public void yanlış_e_posta_adresi_ve_şifre_girin() {
        ReusableMethods.senkeys(signUpLogin.loginEmailButtonu,"asf123@gmail.com");
        ReusableMethods.senkeys(signUpLogin.loginPasswordButtonu,"456678");

    }
    @Then("E-postaniz veya şifreniz yanlis! hatasini dogrulayin")
    public void e_postaniz_veya_şifreniz_yanlis_hatasini_dogrulayin() {
       String expectedText="Your email or password is incorrect!";
       String actualText=signUpLogin.negatifGirisText.getText();
       Assert.assertEquals(expectedText,actualText);


    }
}
