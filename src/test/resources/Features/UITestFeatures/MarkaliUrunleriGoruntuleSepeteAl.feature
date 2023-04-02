Feature: Markalı Ürünleri Görüntüle ve Sepete Al
  @MarkaliUrunleriGoruntule
  Scenario: Markalı Ürünleri Görüntüle ve Sepete Al
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
     And Ürünler dugmesine tiklayin
     And Sol taraftaki çubukta Markaların göründüğünü doğrulayın
     And Herhangi bir marka adına tıklayın
     And Kullanıcının marka sayfasına yönlendirildiğini ve marka ürünlerinin görüntülendiğini doğrulayın.
     And Sol taraftaki çubukta herhangi bir başka marka bağlantısına tıklayın
     And Kullanıcının o marka sayfasına gittiğini ve ürünleri görebildiğini doğrulayın