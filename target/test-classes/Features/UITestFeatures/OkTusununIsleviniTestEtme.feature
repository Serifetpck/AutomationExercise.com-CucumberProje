Feature: Ok" düğmesini ve Aşağı Kaydırma işlevini kullanarak Yukarı Kaydırmayı doğrulayın
  @OkTusuKontrolu
  Scenario: Ok" düğmesini ve Aşağı Kaydırma işlevini kullanarak Yukarı Kaydırmayı doğrulayın
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
     And Alt Bilgiye doğru aşağı kaydırın
     And 'SUBSCRIPTION' metnini doğrulayın
     And Yukarı doğru hareket etmek için sağ alt taraftaki oka tıklayın
     And Sayfanın yukarı kaydırıldığını ve Otomasyon Mühendisleri için Tam Teşekküllü uygulama web sitesi metninin ekranda göründüğünü doğrulayın