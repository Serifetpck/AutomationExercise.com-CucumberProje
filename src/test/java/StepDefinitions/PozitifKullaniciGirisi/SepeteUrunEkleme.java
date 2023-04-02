package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Products;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.ReusableMethods;

public class SepeteUrunEkleme {
Products products=new Products();

    @And("İlk ürünün üzerine gelin ve Sepete ekle kısmına tıklayın")
    public void ilkÜrününÜzerineGelinVeSepeteEkleKısmınaTıklayın() {
        ReusableMethods.waitFor(4);
        ReusableMethods.sayfayıAsagıDogruKaydırma(products.urunSecmeButtonu);
        ReusableMethods.waitForVisibility(products.ilkUrunResmi,5);
        ReusableMethods.waitFor(3);
        products.Ilkurun.click();



    }

    @And("Alışverişe Devam Et düğmesini tıklayın")
    public void alışverişeDevamEtDüğmesiniTıklayın() {
        ReusableMethods.waitFor(4);
        ReusableMethods.textislemleri("Continue Shopping").click();
    }

    @And("İkinci ürünün üzerine gelin ve Sepete ekle kısmına tıklayın")
    public void ikinciÜrününÜzerineGelinVeSepeteEkleKısmınaTıklayın() {
        ReusableMethods.waitFor(4);
        products.Ikinciurun.click();

    }

    @And("Sepeti Görüntüle düğmesini tıklayın")
    public void sepetiGörüntüleDüğmesiniTıklayın() {
        ReusableMethods.waitFor(4);
        products.ikinciUrunuGoruntuleme.click();
    }

    @And("Her iki ürünün de Sepete eklendiğini doğrulayın")
    public void herIkiÜrününDeSepeteEklendiğiniDoğrulayın() {
        //for (int i = 0; i < products.sepetteBulunanUrunler.size(); i++) {
        ReusableMethods.waitFor(4);
            Assert.assertEquals(products.sepetteBulunanUrunler.get(0).getText(),"Women > Tops");




    }

    @And("Fiyatlarını, miktarlarını ve toplam fiyatlarını doğrulayın")
    public void fiyatlarınıMiktarlarınıVeToplamFiyatlarınıDoğrulayın() {
        ReusableMethods.waitFor(4);
      String urun=  products.cartTotal.get(0).getText();
        System.out.println(urun);

    }
}
