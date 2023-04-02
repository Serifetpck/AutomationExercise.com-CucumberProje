Feature: Tum Urunler ve Urun Detay Sayfasi
  @Urunler
  Scenario: Tum Urunler ve Urun Detay Sayfasini Dogrulama
  Given Tarayiciyi baslatin
  Then Sayfanin web URL'sine gidin
  Then Ana sayfanin basariyla göründüğünü dogrulayin
  Then Ürünler dugmesine tiklayin
  Then Kullanicinin TÜM URUNLER sayfasına basariyla yonlendirildiğini dogrulayin
  Then Urun listesini görmeli
  Then Ilk urunun Urunu Goruntuleye tiklayin
  Then Kullanici urun detay sayfasına yonlendirildi
  Then Urun adi, kategorisi, fiyati, bulunabilirligi, durumu, markasi gibi ayrintilarin gorundugunu dogrulayin.