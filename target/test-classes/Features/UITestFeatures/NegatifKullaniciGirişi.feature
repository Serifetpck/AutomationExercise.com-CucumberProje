Feature: Negatif Seneryolu Kullanici Girişi
 @NegatifKullaniciGirişi
  Scenario:  Kullanıcıyı yanlış e-posta ve parola ile Oturum Açın
    Then Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    Then Ana sayfanin basariyla göründüğünü dogrulayin
    Then Kaydol-Giriş Yap dugmesine tiklayin
    Then Hesabiniza giris yapinin gorundugunu dogrulayin
    Then Yanlış e-posta adresi ve şifre girin
    Then Giris dugmesine tiklayin
    Then E-postaniz veya şifreniz yanlis! hatasini dogrulayin