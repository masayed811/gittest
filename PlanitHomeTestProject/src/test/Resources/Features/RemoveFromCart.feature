@RemoveFromCart
Feature: Item remove from cart
  Scenario: User able to remove an item from cart
    Given user is on home page
    When user click on cart
    And user click on delete
   Then Item delete  successfully from cart
