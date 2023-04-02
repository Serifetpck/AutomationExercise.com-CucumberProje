Feature: Bize Ulasin Formu
@ContactForm
  Scenario: Bize Ulaşın Formu Adımları
    Given Tarayiciyi baslatin
    Then Sayfanin web URL'sine gidin
    Then Ana sayfanin basariyla göründüğünü dogrulayin
    Then Bize Ulasin dugmesine tiklayin
    Then ILETISIME GECİN ifadesinin gorunur oldugunu dogrulayin
    Then Adi, e-postayi, konuyu ve mesaji girin
    Then Dosya yukleyin
    Then Gonder dugmesini tiklayin
    Then Tamam dugmesine tiklayin
    Then Basari mesajini dogrulayin Bilgileriniz başariyla gonderildi.
    Then Ana Sayfa dugmesine tiklayin ve ana sayfaya basariyla geldigini dogrulayin