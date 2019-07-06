Feature: Application Login
  @tag1
  Scenario: Verify User is able to login on Facebook
    Given I enter username and password and hit login button
    Then I navigate to Home Page of test application