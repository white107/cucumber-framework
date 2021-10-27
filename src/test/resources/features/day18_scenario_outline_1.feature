@scenario_outline_google_search
Feature: Google_Search_Functionality

  Scenario Outline: google_search
    #


    Given user is on the google page
    And user search for "<item>"
    Then verify the result has "<item>"
    Then close the application

    Examples: TEST DATA
      | item    |
      | iPhone  |
      | tea pot |
      | flower  |
      | tesla   |
      | bmw     |
      | buick   |
      | nissan  |