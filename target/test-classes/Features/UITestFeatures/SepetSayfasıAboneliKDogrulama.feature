Feature: Sepet sayfasında Abonelik Dogrulma
   @SepetAboneligi
  Scenario: Sepet sayfasında Aboneliği Doğrulayın
     Given Tarayiciyi baslatin
     Then  Sayfanin web URL'sine gidin
     And   Ana sayfanin basariyla göründüğünü dogrulayin
     And  Sepet düğmesine tıklayın
     And  Alt Bilgiye doğru aşağı kaydırın
     And  'SUBSCRIPTION' metnini doğrulayın
     And  Giriş alanına e-posta adresini girin ve ok düğmesine tıklayın
     And  Başarı mesajını doğrulayın 'Başarıyla abone oldunuz!' görünür olmalı