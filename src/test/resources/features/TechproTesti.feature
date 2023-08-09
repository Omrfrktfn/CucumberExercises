Feature: US001 TechproEducation Pages Test

  Scenario: TC01 Sayfada Arama Yapma
    Given kullanici techpro sayfasina gider.
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigni test eder
    And sayfayi kapatir.



    Scenario: TC02 Sayfada Arama yapar.
      Given kullanici techpro sayfasina gider.
      Then arama kutusuna java aratir
      And sayfa basliginin java icerdigni test eder
      And sayfayi kapatir.

      Scenario: TC03 Sayfada Arama yapar
        Given kullanici techpro sayfasina gider.
        Then arama kutusunda mobil aratir
        When cikan dropdownda mobil developer tiklar
        And sayfa basliginin Mobile icerdigni test eder
        And sayfayi kapatir.