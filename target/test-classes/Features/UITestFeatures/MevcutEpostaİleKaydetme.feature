Feature: Mevcut Eposta ile Kaydetme
 @MevcutEpostaileKayit
  Scenario: Kullanici Mevcut Eposta ile Kaydeteme
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    Then Ana sayfanin basariyla göründüğünü dogrulayin
    Then Kaydol-Giriş Yap dugmesine tiklayin
    Then Hesabiniza giris yapinin gorundugunu dogrulayin
    Then Adi ve kayitli e-posta adresini girin
    Then Kaydol dugmesini tiklayin
    Then E-posta Adresi zaten mevcut! hatasını doğrulayın