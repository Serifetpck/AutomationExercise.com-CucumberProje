package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Login;
import Pages.Products;
import io.cucumber.java.en.Then;
import utulities.ReusableMethods;

public class UrunArama {

Products products=new Products();
Login login=new Login();

    @Then("Arama girişine ürün adını girin ve ara düğmesine tıklayın")
    public void aramaGirişineÜrünAdınıGirinVeAraDüğmesineTıklayın() {
        ReusableMethods.senkeys(products.urunAramaGirisi,"Dress");
        products.urunAramaButtonu.click();
    }
    @Then("ARALAN URUNLERin gorunur olduğunu doğrulayın")
    public void aralanURUNLERinGorunurOlduğunuDoğrulayın() {
       String text= products.urunAitOzellik.get(0).getText();
        System.out.println(text);
    }


    @Then("Arama ile ilgili tüm ürünlerin görünür olduğunu doğrulayın")
    public void aramaIleIlgiliTümÜrünlerinGörünürOlduğunuDoğrulayın() {
    }


    public static class SepetSayfasındaAbonelikDogrulma {
        public SepetSayfasındaAbonelikDogrulma() {

        }
    }


}
