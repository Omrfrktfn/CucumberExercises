Feature: US001_Amazon_Urun_Arama_Testi

  Scenario: TC01_Amazonda_Iphone_Aramasi

    Given kullanici amazon sayfasina gider
    Then kullanici aramaKutusunda iphone aratir
    And sayfayi kapatir.