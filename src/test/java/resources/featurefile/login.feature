Feature: Login Test
  As user I want to check login functionality

  Scenario Outline: User should enter invalid credential
    Given I am on homepage
    When I enter email "<email>"
    And I enter pasword "<password>"
    And I click on login Button
    Then I should verify error message "<msg>"
    Examples:
      | email               | password   | msg                                                                                                         |
      | thdcyujagsjxguahxs  | 12345678   | The email address or mobile number you entered isn't connected to an account. Find your account and log in. |
      | patel1234@gmail.com | 12345678   | The password that you've entered is incorrect. Forgotten password?                                          |
      |                     |            | The email address or mobile number you entered isn't connected to an account. Find your account and log in. |
      |                     | 12324r5234 | The email address or mobile number you entered isn't connected to an account. Find your account and log in. |
      | patel1234@gmail.com |            | The password that you've entered is incorrect. Forgotten password?                                          |
