Feature: US001 Google Sayfasi Testi

  Scenario Outline: Arama kutusunda ford aratir
    Given kullanici "googleUrl" sayfasina properties ile gider.
    Then kullanici google arama kutusudna "<aranacakArac>" aratir
    And google sayfasinda basligin "<aranacakArac>" icerdigini test eder
    And sayfayi kapatir.
    Examples:
      | aranacakArac |
      | ford         |
      | volvo        |
      | audio        |