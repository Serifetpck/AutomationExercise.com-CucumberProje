Feature: Kullanici Login Fonksiyonu
  @KullanıcıGirisi
  Scenario:Yeni Bir Kullanici OLusturma Islemleri
  Given Tarayiciyi baslatin
  Then Sayfanin web URL'sine gidin
  Then Ana sayfanin basariyla göründüğünü dogrulayin
  Then Kaydol-Giriş Yap dugmesine tiklayin
  Then Hesabiniza giris yapinin gorundugunu dogrulayin
  Then Dogru e-posta adresini ve sifreyi girin
  Then Giris dugmesine tiklayin
  Then -Kullanici adi olarak oturum acildi- ifadesinin görünür olduğunu doğrulayın
  Then Hesabi Sil dugmesini tiklayin
  Then HESAP SİLİNDİ! textininin gorunur oldugunu dogrulayin