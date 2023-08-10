@all
Feature: US003 TechproEducation Pages Test

  Background: kullanici TechproEducation sayfasina gider.
    Given kullanici techpro sayfasina gider.

  Scenario: TC01 Sayfada Arama Yapma
    Then arama kutusunda qa aratir
    And sayfa basliginin qa icerdigni test eder

  Scenario: TC02 Sayfada Arama yapar.
    Then arama kutusuna java aratir
    And sayfa basliginin java icerdigni test eder

  Scenario: TC03 Sayfada Arama yapar
    Then arama kutusunda mobil aratir
    When cikan dropdownda mobil developer tiklar
    And sayfa basliginin Mobile icerdigni test eder
    And sayfayi kapatir.