Feature: US004 TechProEducation Arama Testi

  Scenario: TC02 Sayfada Arama yapar
    Given kullanici "https://techproeducation.com" sayfasina gider.
    Then arama kutusunda "qa" aratir

  Scenario: TC03 Sayfada Arama yapar
    Given kullanici "https://techproeducation.com" sayfasina gider.
    Then arama kutusunda "java" aratir


  Scenario: TC01 Sayfada Arama yapar
    Given kullanici "https://techproeducation.com" sayfasina gider.
    Then arama kutusunda "mobil" aratir
    When cikan dropdownda mobil developer tiklar
    And sayfa basliginin Mobile icerdigni test eder
    And sayfayi kapatir.


  Scenario: TC04 Sayfada Arama yapar
    Given kullanici "https://google.com" sayfasina gider.

  Scenario: TC05 Sayfada Arama yapar
    Given kullanici "https://youtube.com" sayfasina gider.

  Scenario: TC06 Sayfada Arama yapar
    Given kullanici "https://youtube.com" sayfasina gider.