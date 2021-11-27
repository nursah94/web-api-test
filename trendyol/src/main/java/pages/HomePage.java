package pages;

import base.BasePage;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import static org.testng.Assert.assertEquals;

public class HomePage extends BasePage {

    public String PopUpCloseButton = "div[class='modal-close']";
    public String searchBox = "input[class='search-box']";
    public String searchResultTitle = ".dscrptn>h1";


    public HomePage(WebDriver driver, WebDriverWait wait) {
        super(driver, wait);
    }


    public void closePopup() {
        click(By.cssSelector(PopUpCloseButton));
    }

    public void search(String search) {
        sendKeys(By.cssSelector(searchBox), search);
        pressEnter(By.cssSelector(searchBox));
    }

    public void verify(String value) {
        highLightElement(By.cssSelector(searchResultTitle));
        String resultText = driver.findElement(By.cssSelector(searchResultTitle)).getText();
        assertEquals(resultText,value);
    }
}