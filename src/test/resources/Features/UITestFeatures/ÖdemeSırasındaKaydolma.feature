Feature: Odeme Sırasında Kaydolma
  @OdemeSırasındaKaydolma
  Scenario: Odeme Sırasında Kaydolma
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    And Ürünler dugmesine tiklayin
    And İlk ürünün üzerine gelin ve Sepete ekle kısmına tıklayın
    And Sepet sayfasının görüntülendiğini doğrulayın
    And Ödeme İşlemine Devam Et'i tıklayın
    And Kayıt Ol-Giriş Yap düğmesine tıklayın
    And Kaydol'daki tüm ayrıntıları doldurun ve hesap oluşturun
    And  'HESAP OLUŞTURULDU!'nu doğrulayın! ve 'Devam Et' düğmesini tıklayın
    And  Üstte "Kullanıcı adı olarak oturum açıldı"yı doğrulayın
    And Sepet düğmesine tıklayın
    And  'Ödeme İşlemine Devam Et' düğmesini tıklayın
    And  Adres Ayrıntılarını Doğrulayın ve Siparişinizi İnceleyin
    And  Açıklama metin alanına açıklamayı girin ve 'Sipariş Ver'i tıklayın
    And  Ödeme ayrıntılarını girin: Karttaki Ad, Kart Numarası, CVC, Son Kullanma Tarihi
    And  'Öde ve Siparişi Onayla' düğmesine tıklayın
    And  Başarı mesajını doğrulayın 'Siparişiniz başarıyla verildi!'
    And  'Hesabı Sil' düğmesini tıklayınn
    And  'HESAP SİLİNDİ!' ve 'Devam Et' düğmesini tıklayın