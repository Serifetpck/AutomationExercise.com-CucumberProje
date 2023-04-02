package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Products;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utulities.Driver;
import utulities.ReusableMethods;

public class UruneIncelemeEkleme {
Actions actions=new Actions(Driver.getDriver());
Products products=new Products();
    @And("İncelemenizi Yazın baslıgının görünür olduğunu doğrulayın")
    public void incelemeniziYazınBaslıgınınGörünürOlduğunuDoğrulayın() {
        Assert.assertTrue(ReusableMethods.textislemleri("Write Your Review").isDisplayed());
    }

    @And("Adı, e-postayı girin ve gözden geçirin")
    public void adıEPostayıGirinVeGözdenGeçirin() {
        actions.moveToElement(products.urunIncelemeAdBolumu).
                sendKeys("aslı", Keys.TAB).sendKeys("ad567@gmail.com",Keys.TAB).
                sendKeys("Urunde deforme mevcut",Keys.TAB).perform();

    }

    @And("Gönder düğmesini tıklayın")
    public void gönderDüğmesiniTıklayın() {
        products.urunIncelemeSubmitButtonu.click();

    }

    @And("Başarı mesajını doğrulayın İncelemeniz için teşekkür ederiz.")
    public void başarıMesajınıDoğrulayınİncelemenizIçinTeşekkürEderiz() {

    }
}
