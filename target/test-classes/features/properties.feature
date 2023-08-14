Feature: US001 Google Sayfasi Testi

  Background: Google Sayfasina Gidilir.

    Given kullanici "googleUrl" sayfasina properties ile gider.

  Scenario: Arama kutusunda volv aratir
    * kullanici google arama kutusudna "volvo" aratir
    * google sayfasinda basligin "volvo" icerdigini test eder
    And sayfayi kapatir.

  Scenario: Arama kutusunda ford aratir
    Then kullanici google arama kutusudna "ford" aratir
    And google sayfasinda basligin "ford" icerdigini test eder
    And sayfayi kapatir.

  Scenario: Arama kutusunda audio aratir
    Then kullanici google arama kutusudna "audio" aratir
    And google sayfasinda basligin "audio" icerdigini test eder
    And sayfayi kapatir.