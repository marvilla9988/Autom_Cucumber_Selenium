package Paginas;
import Config.PropertyManager;


public class GoogleSearchPage extends BasePage {
    private String searchBox = "//input[@title='Buscar']";
    private String searchButton = "//div[@class='FPdoLc tfB0Bf']//input[@class='gNO89b']";
    private String testData = PropertyManager.getInstance().getSearch_url();

    public GoogleSearchPage(){
        super(driver);
    }


    public void navigateToGoogle(){
        navigateTo(testData);
    }

    public void enterSearchCriteria(String searchText){
        sendKeysTo(searchBox, searchText);
    }

    public void clickOnSearchButtonGoogle(){
        clickElement(searchButton);
    }
}