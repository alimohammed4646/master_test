Feature:

  Scenario: user logs in with valid credentials
    Given as a user I am on Amazon.co.uk
    When I click Sign-In button
    And I enter Username and password
    Then I click on sing in
    And I am logged in successfully