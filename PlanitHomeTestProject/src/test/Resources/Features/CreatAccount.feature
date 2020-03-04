@CraetAccount
Feature: Craete account
  Scenario:User should able to creat an account
    Given user is on home page
    When user click on singIn button
    And user enter  already register email id
    And user click on creat an account button
    Then user can see the error messaage
