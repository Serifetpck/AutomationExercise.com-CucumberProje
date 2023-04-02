package StepDefinitions.PozitifKullaniciGirisi;

import io.cucumber.java.en.And;
import org.junit.Assert;
import utulities.ReusableMethods;

public class MarkaliUrunleriGoruntuleSepeteAl {
    @And("Sol taraftaki çubukta Markaların göründüğünü doğrulayın")
    public void solTaraftakiÇubuktaMarkalarınGöründüğünüDoğrulayın() {
        ReusableMethods.waitFor(3);
        ReusableMethods.sayfayıAsagıDogruKaydırma(ReusableMethods.textislemleri("Brands"));
       Assert.assertTrue( ReusableMethods.textislemleri("Brands").isDisplayed());
    }

    @And("Herhangi bir marka adına tıklayın")
    public void herhangiBirMarkaAdınaTıklayın() {
        ReusableMethods.textislemleri("Polo").click();
    }

    @And("Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın.")
    public void kullanıcınınMarkaSayfasınaYönlendirildiğiniVeMarkaÜrünlerininGörüntülendiğiniDoğrulayın() {
       Assert.assertTrue(ReusableMethods.textislemleri("Brand - Polo Products").isDisplayed());
    }

    @And("Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklayın")
    public void solTaraftakiÇubuktaHerhangiBirBaşkaMarkaBağlantısınaTıklayın() {
        ReusableMethods.textislemleri("H&M").click();
    }

    @And("Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın")
    public void kullanıcınınOMarkaSayfasınaGittiğiniVeÜrünleriGörebildiğiniDoğrulayın() {
      Assert.assertTrue(ReusableMethods.textislemleri("Brand - H&M Products").isDisplayed());
    }
}
