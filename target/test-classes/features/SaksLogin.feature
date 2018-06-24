Feature: Saks login functionality

  Background:

    Given Not a validated user
    When User browse to the site
    Then User close the popup
    Then Saks home page should display
    When User click login link




  Scenario Outline: 1. Valid user with Valid password
    Given Not a validated user
    When User enter user email as "<EmailAddress>"
    And User enter password as "<Password>"
    And User click login button

    Examples:
      |EmailAddress |Password  |
    |yusufahmedny@gmail.com|Shift1234!|
    |ahmed.shozib@gmail.com|Shift1234!|

  Scenario: 2. Valid user with Invalid password
    When User enter user email as "yusufahmedny@gmail.com"
    And User enter password as "Shift1234!"
    Then User click login button








