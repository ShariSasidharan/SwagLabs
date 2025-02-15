Feature: Login as Standard User
  
@Login 
  Scenario: Perform login functionality as a Standard user
    Given I am in the login page of Swag Labs demo page
    When I give the login details of Standard User with user id "standard_user"
    Then I logged in successfully
    #comment test