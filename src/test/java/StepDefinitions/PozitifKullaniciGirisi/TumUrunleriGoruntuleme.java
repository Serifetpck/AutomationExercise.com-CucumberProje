package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Products;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.JavascriptExecutor;
import utulities.Driver;
import utulities.ReusableMethods;

public class TumUrunleriGoruntuleme {

    Products products=new Products();

    @Then("Ürünler dugmesine tiklayin")
    public void ürünlerDugmesineTiklayin() throws InterruptedException {
        ReusableMethods.anasyfaGirisBaslıkları("products").click();

    }


    @Then("Kullanicinin TÜM URUNLER sayfasına basariyla yonlendirildiğini dogrulayin")
    public void kullanicininTÜMURUNLERSayfasınaBasariylaYonlendirildiğiniDogrulayin() throws InterruptedException {
        Thread.sleep(2000);
       Assert.assertTrue(ReusableMethods.textislemleri("All Products").isDisplayed());
    }

    @Then("Urun listesini görmeli")
    public void urunListesiniGörmeli() throws InterruptedException {
        for (int i = 0; i <  products.tumUrunler.size() ; i++) {
            Thread.sleep(2000);
            Assert.assertTrue(products.tumUrunler.get(0).isDisplayed());
            Thread.sleep(2000);
        }


    }

    @Then("Ilk urunun Urunu Goruntuleye tiklayin")
    public void ılkUrununUrunuGoruntuleYeTiklayin() throws InterruptedException {
        Thread.sleep(3000);
        JavascriptExecutor js = (JavascriptExecutor) Driver.getDriver();
        js.executeScript("arguments[0].click();", products.urunSecmeButtonu);

    }

    @Then("Kullanici urun detay sayfasına yonlendirildi")
    public void kullaniciUrunDetaySayfasınaYonlendirildi() {
       Assert.assertTrue(products.urununSecildiginiGoruntuleme.isDisplayed());
    }

    @Then("Urun adi, kategorisi, fiyati, bulunabilirligi, durumu, markasi gibi ayrintilarin gorundugunu dogrulayin.")
    public void urunAdiKategorisiFiyatiBulunabilirligiDurumuMarkasiGibiAyrintilarinGorundugunuDogrulayin() throws InterruptedException {
        for (int i = 0; i <products.urununOzellikleri.size() ; i++) {
            Thread.sleep(2000);
            Assert.assertTrue(products.urununOzellikleri.get(i).isDisplayed());
            Thread.sleep(2000);
        }

    }
}