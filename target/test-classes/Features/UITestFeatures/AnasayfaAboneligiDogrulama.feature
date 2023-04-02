Feature: Anasayfada Abonelik Dogrulama
  @AboneEmailIslemi
  Scenario: Ansayfada Abonelik Dogrulma islemi
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    Then Ana sayfanin basariyla göründüğünü dogrulayin
     And Alt Bilgiye doğru aşağı kaydırın
     And 'SUBSCRIPTION' metnini doğrulayın
     And Giriş alanına e-posta adresini girin ve ok düğmesine tıklayın
     And Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür olmalı