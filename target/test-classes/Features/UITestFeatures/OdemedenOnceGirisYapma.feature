Feature: Odemeden Once Giris Yapma
  Scenario: Odeme Yapmadan Giris Yapma
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    And Kayıt Ol-Giriş Yap düğmesine tıklayın
    Then Dogru e-posta adresini ve sifreyi girin
    Then Giris dugmesine tiklayin
    Then -Kullanici adi olarak oturum acildi- ifadesinin görünür olduğunu doğrulayın
    And İlk ürünün üzerine gelin ve Sepete ekle kısmına tıklayın
    And Sepet düğmesine tıklayın
    And  'Ödeme İşlemine Devam Et' düğmesini tıklayın
    And  Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
    And  Açıklama metin alanına açıklamayı girin ve 'Sipariş Ver'i tıklayın
    And  Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi
    And  'Öde ve Siparişi Onayla' düğmesine tıklayın
    And  Başarı mesajını doğrulayın 'Siparişiniz başarıyla verildi!'
    And  'Hesabı Sil' düğmesini tıklayın
    And  'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın
