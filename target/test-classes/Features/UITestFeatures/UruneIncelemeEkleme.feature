Feature: Urune Inceleme Ekleme
  @UruneIncelemeEkleme
  Scenario: Urune Inceleme Ekleme
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    And Ürünler dugmesine tiklayin
    And Kullanicinin TÜM URUNLER sayfasına basariyla yonlendirildiğini dogrulayin
    And Ilk urunun Urunu Goruntuleye tiklayin
    And İncelemenizi Yazın baslıgının görünür olduğunu doğrulayın
    And Adı, e-postayı girin ve gözden geçirin
    And Gönder düğmesini tıklayın
    And Başarı mesajını doğrulayın İncelemeniz için teşekkür ederiz.