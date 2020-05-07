Feature: Ejemplo The Free Range Tester

  Scenario : Navigate to Google and Search a Keyword
    Given I am on the Google search page
    When I enter a world in the search field
    And Click on the search button
    Then I see results related to the word entered
