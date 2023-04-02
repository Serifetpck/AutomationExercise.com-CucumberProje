Feature: Kategori Ürünlerini Görüntüleme
  @KategoriUrunleriniGoruntuleme
  Scenario: Kategori Ürünlerini Görüntüleme
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
     And Kategorilerin sol taraftaki çubukta göründüğünü doğrulayın
     And Kadınlar kategorisine tıklayın
     And Kadınlar kategorisi altındaki herhangi bir kategori bağlantısına tıklayın, örneğin: Elbise
     And Kategori sayfasının görüntülendiğini doğrulayın ve KADIN - TOPS ÜRÜNLERİ metnini onaylayın
     And Sol taraftaki çubukta, Erkekler kategorisinin herhangi bir alt kategori bağlantısına tıklayın
     And Kullanıcının o kategori sayfasına yönlendirildiğini doğrulayın