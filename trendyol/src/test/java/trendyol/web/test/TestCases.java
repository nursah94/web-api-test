package trendyol.web.test;

import org.junit.Test;
import pages.HomePage;

public class TestCases extends BaseWebTest {

    @Test
    public void search() {
        HomePage homePage = new HomePage(driver, wait);
        homePage.closePopup();
        homePage.search("televizyon");
        homePage.verify("televizyon");
    }
}


