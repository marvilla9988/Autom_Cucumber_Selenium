package Paginas;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {
    protected static WebDriver driver;
    private static WebDriverWait wait;

    static {
        System.setProperty("webdriver.chrome.driver","C:\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        wait = new WebDriverWait(driver, 10);
    }

    public BasePage(WebDriver driver) {
        BasePage.driver = driver;
        PageFactory.initElements(driver, this);
        wait = new WebDriverWait(driver, 10);

    }

    public static void closeBrowser(){driver.close();}

    public static void navigateTo(String url){driver.get(url);}

    private WebElement Find(String locator){
        return wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(locator)));
    }

    public String FindText(String locator){
        String text = driver.findElement(By.xpath(locator)).getText();
        return text;
    }

    public void clickElement(String locator){
        Find(locator).click();
    }

    public void sendKeysTo(String locator, String KeysToSend){
        Find(locator).clear();
        Find(locator).sendKeys(KeysToSend);
    }



}
