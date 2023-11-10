Feature: Cash Withdrawal
  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $30
    Then $30 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $200
    Then $200 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $200 in my wallet
    When I request $1
    Then $1 should be dispensed

  Scenario: Successful withdrawal from a wallet in credit
    Given I have deposited $1200 in my wallet
    When I request $330
    Then $330 should be dispensed

    Scenario: Unsuccessful withdrawal from a wallet in credit
      Given I have deposited $200 in my wallet
      When I request $250
      Then $250 should not be dispensed