Feature: Giris Yaptiktan Sonra Urunleri Arayin Ve Sepeti Dogrulayin
  @UrunleriAramavesepetiOnaylma
  Scenario: Giris Yaptiktan Sonra Urunleri Arayin Ve Sepeti Dogrulayin
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
      And Ürünler dugmesine tiklayin
      And Kullanicinin TÜM URUNLER sayfasına basariyla yonlendirildiğini dogrulayin
      And Arama girişine ürün adını girin ve ara düğmesine tıklayın
      And ARANAN ÜRÜNLERin görünür olduğunu doğrulayın
      And Arama ile ilgili tüm ürünlerin görünür olduğunu doğrulayın
      And Bu ürünleri sepete ekleyin
      And Sepet düğmesine tıklayın ve ürünlerin sepette göründüğünü doğrulayın
      And Kaydol-Giriş Yap düğmesini tıklayın ve giriş bilgilerini gönderin
      And Tekrar Sepet sayfasına gidin
      And Giriş yaptıktan sonra bu ürünlerin de sepette göründüğünü doğrulayın.