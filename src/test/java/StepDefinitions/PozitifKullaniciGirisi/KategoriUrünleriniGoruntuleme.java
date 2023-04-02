package StepDefinitions.PozitifKullaniciGirisi;

import Pages.MainPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import utulities.Driver;
import utulities.ReusableMethods;

public class KategoriUrünleriniGoruntuleme {

MainPage mainPage=new MainPage();

    @And("Kategorilerin sol taraftaki çubukta göründüğünü doğrulayın")
    public void kategorilerinSolTaraftakiÇubuktaGöründüğünüDoğrulayın() {
        ReusableMethods.waitFor(3);
        ReusableMethods.sayfayıAsagıDogruKaydırma(ReusableMethods.textislemleri("Category"));
        Assert.assertTrue(ReusableMethods.textislemleri("Category").isDisplayed());
    }

    @And("Kadınlar kategorisine tıklayın")
    public void kadınlarKategorisineTıklayın() {
        ReusableMethods.waitFor(3);
        mainPage.kategoriWomen.click();
    }

    @And("Kadınlar kategorisi altındaki herhangi bir kategori bağlantısına tıklayın, örneğin: Elbise")
    public void kadınlarKategorisiAltındakiHerhangiBirKategoriBağlantısınaTıklayınÖrneğinElbise() {
        ReusableMethods.waitFor(3);
        mainPage.kategoriWomen.click();
        mainPage.kategoriWomenDress.click();
    }

    @And("Kategori sayfasının görüntülendiğini doğrulayın ve KADIN - TOPS ÜRÜNLERİ metnini onaylayın")
    public void kategoriSayfasınınGörüntülendiğiniDoğrulayınVeKADINTOPSÜRÜNLERİMetniniOnaylayın() {
        ReusableMethods.waitFor(3);
      Assert.assertTrue(ReusableMethods.textislemleri("Women - Dress Products").isDisplayed());
    }

    @And("Sol taraftaki çubukta, Erkekler kategorisinin herhangi bir alt kategori bağlantısına tıklayın")
    public void solTaraftakiÇubuktaErkeklerKategorisininHerhangiBirAltKategoriBağlantısınaTıklayın() {
        ReusableMethods.waitFor(3);
        mainPage.kategoriMen.click();
        ReusableMethods.textislemleri("Tshirts ").click();
    }

    @And("Kullanıcının o kategori sayfasına yönlendirildiğini doğrulayın")
    public void kullanıcınınOKategoriSayfasınaYönlendirildiğiniDoğrulayın() {
        ReusableMethods.waitFor(3);
        Assert.assertTrue(ReusableMethods.textislemleri("Men - Tshirts Products").isDisplayed());

    }
}
