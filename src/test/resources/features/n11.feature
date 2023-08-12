Feature: US001_HepsiBurada_Urun_Arama_Testi

  Scenario: TC01_HepsiBurada_Samsung_Aramasi

    Given kullanici HepsiBurada sayfasina gider
    Then kullanici aramaKutusunda apple aratir
    And sayfayi kapatir.

