Feature: Sepete Urun Ekleme
  @SepeteUrunEkleme
  Scenario: Sepete Urun Eklme Islemi
    Given  Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    Then Ana sayfanin basariyla göründüğünü dogrulayin
     And Ürünler dugmesine tiklayin
     And İlk ürünün üzerine gelin ve Sepete ekle kısmına tıklayın
     And Alışverişe Devam Et düğmesini tıklayın
     And İkinci ürünün üzerine gelin ve Sepete ekle kısmına tıklayın
     And Sepeti Görüntüle düğmesini tıklayın
     And Her iki ürünün de Sepete eklendiğini doğrulayın
     And Fiyatlarını, miktarlarını ve toplam fiyatlarını doğrulayın