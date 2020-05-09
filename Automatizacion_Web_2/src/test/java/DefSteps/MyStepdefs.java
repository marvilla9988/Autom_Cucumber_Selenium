package DefSteps;

import Paginas.googleSearchPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class MyStepdefs {

    googleSearchPage googleSearch = new googleSearchPage();

    @Given("I am on the Google search page")
    public void iAmOnTheGoogleSearchPage() {
        googleSearch.NavigateToGoogle();
    }

    @When("I enter a word in the search field")
    public void iEnterAWordInTheSearchField() {
        googleSearch.enterSearchCriteria("www.TheFreeRangeTester.com");
    }

    @And("click on the search button")
    public void clickOnTheSearchButton() {
        googleSearch.clickSearchGoogle();
    }

    @Then("I see results related to the word entered")
    public void iSeeResultsRelatedToTheWordEntered() {
    }
}
