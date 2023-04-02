Feature: Oturum Kapatma Islemi

  @OturumKapatmaİslemi
  Scenario: Kullanicinin Oturumu Sonlandırması Islemleri
    Given Tarayiciyi baslatin
    Then  Sayfanin web URL'sine gidin
    And   Ana sayfanin basariyla göründüğünü dogrulayin
    Then  Kaydol-Giriş Yap dugmesine tiklayin
    And   Hesabiniza giris yapinin gorundugunu dogrulayin
    Then  Dogru e-posta adresini ve sifreyi girin
    Then  Giris dugmesine tiklayin
    And   -Kullanici adi olarak oturum acildi- ifadesinin görünür olduğunu doğrulayın
    Then  Çıkıs dugmesini tiklayin
    Then  Kullanıcının oturum açma sayfasına yönlendirildiğini doğrulayın
    Then  Sayfayı Kapatır