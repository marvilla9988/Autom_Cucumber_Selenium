
package DefSepts;
/*Clase generada desde muestra.feature con la opcion de generar all steps definition Java*/

import Paginas.GoogleSearchPage;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs_Java {

    GoogleSearchPage googleSearch = new GoogleSearchPage();

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        googleSearch.navigateToGoogle();
    }

    @When("I enter a world in the search field")
    public void iEnterAWorldInTheSearchField() {
        googleSearch.enterSearchCriteria("www.thefreerangetester.com");
    }

    @And("Click on the search button")
    public void clickOnTheSearchButton() {
        googleSearch.clickOnSearchButtonGoogle();
    }

    @Then("I see results related to the word entered")
    public void iSeeResultsRelatedToTheWordEntered() {

    }
}