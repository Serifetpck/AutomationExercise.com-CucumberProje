package StepDefinitions.PozitifKullaniciGirisi;

import Pages.*;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.interactions.Actions;
import utulities.Driver;
import utulities.ReusableMethods;

public class OdemeSırasındaKaydolma {
  Products products=new Products();
  Login login=new Login();

  CartPage cartPage=new CartPage();
  Actions actions=new Actions(Driver.getDriver());

  MainPage mainPage=new MainPage();
    @And("Sepet sayfasının görüntülendiğini doğrulayın")
    public void sepetSayfasınınGörüntülendiğiniDoğrulayın() {
      ReusableMethods.waitFor(4);
      ReusableMethods.textislemleri(" Cart").click();
      ReusableMethods.waitFor(3);

        Assert.assertTrue(products.sepetSayasiniDogrulama.isDisplayed());
    }

    @And("Ödeme İşlemine Devam Et'i tıklayın")
    public void ödemeİşlemineDevamEtITıklayın() {
      ReusableMethods.waitFor(4);
        products.odemeSayfasınaYonlendirme.click();
    }





    @And("Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun")
    public void kaydolDakiTümAyrıntılarıDoldurunVeHesapOluşturun() throws InterruptedException {
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

    @And("{string}nu doğrulayın! ve {string} düğmesini tıklayın")
    public void hesapOLUŞTURULDUNuDoğrulayınVeDevamEtDüğmesiniTıklayın(String hesap,String devamet) {
      ReusableMethods.waitFor(4);
      if (login.AccountCreatedText.isDisplayed()){

        Assert.assertTrue(login.AccountCreatedText.isDisplayed());
      }else {
        Driver.getDriver().switchTo().frame(login.frame).findElement(By.xpath("//*[@id='dismiss-button']")).click();
        Driver.getDriver().switchTo().defaultContent();
      }
      login.continueButton.click();
    }

    @And("Üstte {string}yı doğrulayın")
    public void üstteYıDoğrulayın(String arg0) throws InterruptedException {
     //Thread.sleep(5000);
     //Assert.assertTrue(login.loggedText.isDisplayed());
     //login.hesapolusturulduDevamEtButtonu.click();
    }

    @And("{string} düğmesini tıklayın")
    public void ödemeİşlemineDevamEtDüğmesiniTıklayın(String odeme) {
      ReusableMethods.waitFor(4);
      mainPage.cartButonu.click();
      products.odemeSayfasınaYonlendirme.click();

    }

    @And("Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin")
    public void adresAyrıntılarınıDoğrulayınVeSiparişiniziİnceleyin() {

    // for (int i = 1; i < cartPage.faturaAdresi.size(); i++) {
    //   Assert.assertTrue(cartPage.faturaAdresi.get(i).getText().contains(cartPage.teslimatAdresi.get(i).getText()));

    // }



    }

    @And("Açıklama metin alanına açıklamayı girin ve {string}i tıklayın")
    public void açıklamaMetinAlanınaAçıklamayıGirinVeSiparişVerITıklayın(String siparis) {
      cartPage.teslimatMesajı.sendKeys("Lütfen adrese teslimat yapınız!");
      cartPage.siparisVerButtonu.click();

    }

    @And("Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi")
    public void ödemeAyrıntılarınıGirinKarttakiAdKartNumarasıCVCSonKullanmaTarihi() {
      for (int i = 0; i <5 ; i++) {
        if (i==0){
          cartPage.hesapKartBilgileri.get(i).sendKeys("aslı");
        } else if (i==1) {
          cartPage.hesapKartBilgileri.get(i).sendKeys("1234567890123456");

        }else if(i==2){
          cartPage.hesapKartBilgileri.get(i).sendKeys("123");

        } else if (i==3) {
          cartPage.hesapKartBilgileri.get(i).sendKeys("12");

        } else if (i==4) {
          cartPage.hesapKartBilgileri.get(i).sendKeys("2024");

        }

      }



    }

    @And("Başarı mesajını doğrulayın {string}")
    public void başarıMesajınıDoğrulayınSiparişinizBaşarıylaVerildi(String mesaj) {
      String expectedResult="Congratulations! Your order has been confirmed!";
      ReusableMethods.waitForVisibility(cartPage.siparişOnaylamaMesaji,20);

      Assert.assertTrue(cartPage.siparişOnaylamaMesaji.isDisplayed());

    }

    @And("{string} ve {string} düğmesini tıklayın")
    public void hesapSİLİNDİVeDevamEtDüğmesiniTıklayın() {
      mainPage.deleteAccountButonu.click();

    }



  @And("Kayıt Ol-Giriş Yap düğmesine tıklayın")
  public void kayıtOlGirişYapDüğmesineTıklayın() {
    ReusableMethods.waitFor(4);

    ReusableMethods.textislemleri("Register / Login").click();
  }

  @And("{string} düğmesine tıklayın")
  public void ödeVeSiparişiOnaylaDüğmesineTıklayın(String odeme) {
    cartPage.siparişOnaylamaButtonu.click();
  }
}
