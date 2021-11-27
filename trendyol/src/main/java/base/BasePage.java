package base;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }


    public void click(By locator) {
        highLightElement(locator);
        wait.until(ExpectedConditions.elementToBeClickable(locator)).click();
    }

    public void sendKeys(By locator, String value) {
        highLightElement(locator);
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(locator));
        webElement.clear();
        webElement.sendKeys(value);
    }

    public void pressEnter(By locator) {
        driver.findElement(locator).sendKeys(Keys.ENTER);
    }

    public void highLightElement(By locator)
    {
        JavascriptExecutor js = (JavascriptExecutor)driver;
        js.executeScript("arguments[0].setAttribute('style', 'background: yellow; border: 3px solid red;');", driver.findElement(locator));
    }

}
