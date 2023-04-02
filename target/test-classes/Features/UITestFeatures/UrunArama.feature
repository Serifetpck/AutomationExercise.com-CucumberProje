Feature: Urun Arama Fonksiyonu
@UrunArama
  Scenario: Kullanici Urun Aratabilmeli
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    Then Ana sayfanin basariyla göründüğünü dogrulayin
    Then Ürünler dugmesine tiklayin
    Then Kullanicinin TÜM URUNLER sayfasına basariyla yonlendirildiğini dogrulayin
    Then Arama girişine ürün adını girin ve ara düğmesine tıklayın
    Then ARALAN URUNLERin gorunur olduğunu doğrulayın
    Then Arama ile ilgili tüm ürünlerin görünür olduğunu doğrulayın