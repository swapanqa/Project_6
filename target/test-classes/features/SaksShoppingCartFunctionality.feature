Feature: shoppingCart Functionality
  Background:


    Given Not a validated user
    When User browse to the site
    Then User close the popup
    Then Saks home page should display


    Scenario: 1 Product selection
      When User click on MenWear
      Then Browser display Men page
      When User click Menwear from caragory
      Then Browser display men wear list
      Then User click Paige
      Then Browser display PaigeSizePage
      Then User click Size_twenty_eight
      Then User click quantity button to incrase
      Then User click Add To Bag
      Then Browser display shopping bag

  Scenario: 2 Checkout option
    When User click on MenWear
    Then Browser display Men page
    When User click Menwear from caragory
    Then Browser display men wear list
    Then User click Paige
    Then Browser display PaigeSizePage
    Then User click Size_twenty_eight
    Then User click quantity button to incrase
    Then User click Add To Bag
    Then Browser display shopping bag
    Then User click Check out button
    And Browser display Check out Page





