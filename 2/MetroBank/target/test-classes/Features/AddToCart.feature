@AddToCart
Feature: Item add to cart
  Scenario: User able to add an item to cart
    Given user is on home page
    When user click on item
    And user click on selected iteme
    And User select quanty
    And user click on add to cart
    Then user can see the message item Added to Cart
