@AddToCart
Feature: Item add to cart
  Scenario: User able to add an item to cart
    Given user is on home page
    When user click on item
    And user select size
    And User select color
    And user click on add to cart
    Then user can see the message Product successfully added to your shopping cart
