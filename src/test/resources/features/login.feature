Feature: Login Tests
  Scenario: Login success
    Given I have username and password
    When I enter click
    Then I see success page
