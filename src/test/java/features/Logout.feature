Feature: Logout

  Background:
    Given I am in the login page of Swag Labs demo page
    When I give the login details of Standard User with user id "standard_user"
    Then I logged in successfully

  @Logout
  Scenario: Logout from the Saucedemo home page
    Given I am in the product detail page
    Then I click on the burger button
    And I click on logout