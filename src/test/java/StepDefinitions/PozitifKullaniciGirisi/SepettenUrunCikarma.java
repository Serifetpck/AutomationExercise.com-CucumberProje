package StepDefinitions.PozitifKullaniciGirisi;

import Pages.CartPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.ReusableMethods;

public class SepettenUrunCikarma {
CartPage cartPage=new CartPage();

    @And("Belirli bir ürüne karşılık gelen {string} düğmesine tıklayın")
    public void belirliBirÜrüneKarşılıkGelenXDüğmesineTıklayın() {
        cartPage.siparisUrununuCıkarma.click();
    }

    @And("Ürünün sepetten çıkarıldığını doğrulayın")
    public void ürününSepettenÇıkarıldığınıDoğrulayın() {
       Assert.assertTrue(ReusableMethods.textislemleri("Cart is empty!").isDisplayed());
    }
}
