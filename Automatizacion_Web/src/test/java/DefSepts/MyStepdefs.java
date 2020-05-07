package DefSepts;
/*Clase generada desde muestra.feature con la opcion de generar all steps definition Java(Java 8)*/

import Paginas.GoogleSearchPage;
import cucumber.api.java8.En;

public class MyStepdefs implements En {

    public MyStepdefs() {
        GoogleSearchPage googleSearch = new GoogleSearchPage();

        Given("^I am on the Google search page$", () -> {
            googleSearch.navigateToGoogle();
        });
        When("^I enter a world in the search field$", () -> {
            googleSearch.enterSearchCriteria("www.thefreerangetester.com");
        });
        And("^Click on the search button$", () -> {
            googleSearch.clickOnSearchButtonGoogle();
        });
        Then("^I see results related to the word entered$", () -> {
        });
    }
}