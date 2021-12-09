
  Feature: Amazon Kullanıcı İşlemleri Senaryoları

    Scenario Outline: Kullanıcı Giriş Yap Testi
      Given Kullanıcı anasayfayı ziyaret eder.
      When  Kullanıcı Hesap ve Listeler' e tıklar.
      When  "<Eposta>" girilir ve devam et butonuna tıklanır.
      When  "<Sifre>" girilir. Giriş yap butonuna tıklanır.
      Then  Giriş yapıldığı görülür.
      Examples:
        | Eposta                    |  | Sifre      |
        | bktestotomasyon@gmail.com |  | Test102030 |
        | bktestotomasyon@gmail.com |  | TestTestT  |
        | 1bktestotomasyon1@gmail.com |  | ABCDEFGH |


    Scenario Outline: Ürün Sepete Ekleme Testi
      Given Kullanıcı anasayfayı ziyaret eder.
      When Kullanıcı arama butonuna "<Urun>" girer ve arama butonuna tıklar.
      When Kullanıcı ürüne tıklar.
      When Kullanıcı sepete ekle butonuna tıklar.
      Then İlgili ürünün sepete eklendiği görülür.
      Examples:
      |Urun|
      |Laptop|
      |Kulaklık|
      |Sucuk   |
      |Ford Focus|

      Scenario Outline:
        Given Kullanıcı anasayfayı ziyaret eder.
        When Tümü butonuna tıklanır.
        When Hesabım butonuna tıklanır.
        When Giriş yapma ve Güvenlik butonuna tıklanır.
        When Ad kısmında düzenle butonuna tıklanır.
        When Güncellenilmesi istenilen "<Ad>" girilir. Değişiklikleri kaydet butonuna tıklanır.
        Then İşlemin başarılı olduğu görülür.
        Examples:
        |Ad|
        |BKTest|
        |***   |
        |?!?!?!?|
        |ÇŞÜĞ   |


