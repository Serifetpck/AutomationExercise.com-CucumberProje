package StepDefinitions.PozitifKullaniciGirisi;

import Pages.Login;
import Pages.MainPage;
import Pages.Products;
import io.cucumber.java.bs.A;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utulities.Driver;
import utulities.ReusableMethods;

public class GirisYaptiktanSonraUrunleriArayinVeSepetiDogrulayin {
Products products=new Products();
MainPage mainPage=new MainPage();
Actions actions=new Actions(Driver.getDriver());

Login login=new Login();
    @And("ARANAN ÜRÜNLERin görünür olduğunu doğrulayın")
    public void arananÜRÜNLERinGörünürOlduğunuDoğrulayın() {
        Assert.assertTrue(products.ArananElbise.isDisplayed());

    }

    @And("Bu ürünleri sepete ekleyin")
    public void buÜrünleriSepeteEkleyin() {
        ReusableMethods.waitFor(4);
        ReusableMethods.sayfayıAsagıDogruKaydırma(products.ArananElbiseninResmi);
        ReusableMethods.waitForVisibility(products.ArananElbiseninResmi,5);
        ReusableMethods.waitFor(3);
        products.ArananElbisenyiSepeteEklemeButonu.click();
    }

    @And("Sepet düğmesine tıklayın ve ürünlerin sepette göründüğünü doğrulayın")
    public void sepetDüğmesineTıklayınVeÜrünlerinSepetteGöründüğünüDoğrulayın() {
        products.sepeteGoruntulemeButonu.click();

        Assert.assertTrue(ReusableMethods.textislemleri("Sleeveless Dress").isDisplayed());

    }

    @And("Kaydol-Giriş Yap düğmesini tıklayın ve giriş bilgilerini gönderin")
    public void kaydolGirişYapDüğmesiniTıklayınVeGirişBilgileriniGönderin() throws InterruptedException {
        mainPage.KullanıcıGirisi.click();
        Thread.sleep(3000);
        login.signName.sendKeys("aslı");
        login.signEmail.sendKeys("ad567@gmail.com");
        Thread.sleep(4000);
        login.signUpButtonu.click();
        Thread.sleep(3000);
        login.radioButton.click();
        Thread.sleep(4000);




        actions.sendKeys(Keys.PAGE_DOWN).sendKeys(Keys.TAB).sendKeys(Keys.TAB).sendKeys("12234").sendKeys(Keys.TAB).sendKeys("3").
                sendKeys(Keys.TAB).sendKeys("J").sendKeys(Keys.TAB).sendKeys("1").perform();
        login.checkbox.get(0).click();

        login.checkbox.get(1).click();
        actions.sendKeys(Keys.TAB,"aslı").sendKeys(Keys.TAB,"Dalan").sendKeys(Keys.TAB,"annonim a.ş").
                sendKeys(Keys.TAB,"başgar caddesi no:43 İstanbul/Bağcılar",Keys.TAB,"lale sok. no:54 İstanbul/Şile",
                        Keys.TAB,"Turkiye",Keys.TAB ,"Marmara",Keys.TAB,"İstanbul",Keys.TAB,"34100",Keys.TAB,"4535678993").perform();

        actions.sendKeys(Keys.PAGE_DOWN).perform();
        Thread.sleep(3000);
        login.createAccountButton.click();


    }


    @And("Tekrar Sepet sayfasına gidin")
    public void tekrarSepetSayfasınaGidin() {
        mainPage.cartButonu.click();


    }

    @And("Giriş yaptıktan sonra bu ürünlerin de sepette göründüğünü doğrulayın.")
    public void girişYaptıktanSonraBuÜrünlerinDeSepetteGöründüğünüDoğrulayın() {
        Assert.assertTrue(ReusableMethods.textislemleri("Sleeveless Dress").isDisplayed());
    }
}
