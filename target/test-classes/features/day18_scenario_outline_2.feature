@scenario_outline_capital_search
Feature: capital_search_feature

  Scenario Outline: capital_search_scenario

    Given user is on the google page
    And user search for "<world_capitals>"
    Then verify the result has "<world_capitals>"
    Then close the application

    Examples: TEST DATA
      | world_capitals |
      | London         |
      | Paris          |
      | Vienna         |
      | Berlin         |
      | Madrid         |
