Feature: Submit Order

Background:
    Given I am in the login page of Swag Labs demo page
    When I give the login details of Standard User with user id "standard_user"
    Then I logged in successfully

  @SubmitOrder
  Scenario: Submit order in the Saucedemo website by logging in as Standard user
    Given I am in the product detail page 
    Then I select a single product and add to Cart
    Then I click on the Cart icon
    Then I verify the product in the checkout page
    And I click on checkout
    And I enter the checkout Information
    And I verify the Checkout Overview
    And I click on the Finish button
    And I verify the final page