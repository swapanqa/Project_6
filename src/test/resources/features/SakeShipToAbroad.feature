Feature: Saks shipping to foreign country

  Background:

    Given Not a validated user
    When User browse to the site
    Then User close the popup
    Then Saks home page should display


    Scenario: 1 select a foreign country
      When User click ShipTo link
      Then ShipTo page display
      Then User select country
      And User click save and continue

