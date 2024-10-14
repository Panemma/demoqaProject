package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class WebTablesTest extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
        scrollToElement(homepagePage.getElementsButton().get(0));
    }

    @Test
    public void thereAreThreeRecords() {

        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Web Tables");
        Assert.assertEquals(webTablesPage.rowsFilled(), 3);
        Assert.assertTrue(webTablesPage.threeRowsFilled());
    }

    @Test
    public void userCanRemoveAllRecords() {
        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("Web Tables");
        Assert.assertEquals(webTablesPage.rowsFilled(), 3);
// DELETE RECORDS FUNCTION
        Assert.assertEquals(webTablesPage.rowsFilled(), 0);
    }


}