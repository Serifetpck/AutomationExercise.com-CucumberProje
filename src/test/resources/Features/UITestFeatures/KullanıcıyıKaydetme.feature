Feature:Login Fonksiyonu
 @KullaniciyiKaydetme
  Scenario: Kullanıciyi Kaydetme
  Given  Tarayiciyi baslatin
  Then Sayfanin web URL'sine gidin
  Then Ana sayfanin basariyla göründüğünü dogrulayin
  Then Signup-Login dugmesine tiklayin
  Then 'New User Signup!' nin gorunur oldugunu dogrulayin
  Then Adi ve e-posta adresini girin
  Then Kaydol dugmesini tiklayin
  Then "ENTER ACCOUNT INFORMATION" ifadesinin gorundugunu dogrulayin
  Then Ayrintilari doldurun: Unvan, Ad, E-posta, Parola, Doğum tarihi
  Then Bultenimize kaydolun! onay kutusunu seçin.
  Then Ortaklarimizdan özel teklifler alin! onay kutusunu seçin.
  Then Ayrintilari doldurun: Ad, Soyad, Şirket, Adres, Adres2, Ülke, Eyalet, Şehir, Posta Kodu, Cep Numarasi
  Then Hesap Olustur dugmesini tiklayin
  Then HESAP OLUŞTURULDU! yazisinin görünür oldugunu dogrulayin
  Then Devam Et dugmesini tiklayin
  Then Kullanici adi olarak oturum acildi ifadesinin gorunur oldugunu dogrulayin
  Then Sayfayı Kapatır
