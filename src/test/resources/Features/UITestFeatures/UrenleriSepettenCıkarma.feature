Feature: Urunleri Sepetten Cikarma
  Scenario: Urunleri Sepetten Cikarma
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    And İlk ürünün üzerine gelin ve Sepete ekle kısmına tıklayın
    And 'Sepet' düğmesine tıklayın
    And Belirli bir ürüne karşılık gelen 'X' düğmesine tıklayın
    And Ürünün sepetten çıkarıldığını doğrulayın