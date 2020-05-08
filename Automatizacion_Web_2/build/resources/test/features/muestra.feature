Feature: Ejemplo The Free Range Tester
  @Test
  Scenario: Navigate to Google and Search a keyword.
    Given I am on the Google search page
    When I enter a word in the search field
    And click on the search button
    Then I see results related to the word entered

