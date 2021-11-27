package trendyol.web.test;

import org.junit.Before;
import org.junit.After;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.openqa.selenium.chrome.ChromeOptions;

public class BaseWebTest {

    public WebDriver driver;
    public WebDriverWait wait;

    @Before
    public void setUp() {
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--disable-notifications");
        driver = new ChromeDriver(options);
        wait = new WebDriverWait(driver, 45);
        driver.get("https://www.trendyol.com/");
        driver.manage().window().maximize();
    }

    @After
    public void teardown() {
        driver.quit();
    }
}

