Feature: Login failure as Visual User

  @NegativeVisualUserLogin
  Scenario: Perform login as a Visual user with incorrect credentials
    Given I am in the login page of Swag Labs demo page
    When I give the login details of Visual User with user id "visual_user"
    Then I get a login error with an error message containing "Username and password do not match"