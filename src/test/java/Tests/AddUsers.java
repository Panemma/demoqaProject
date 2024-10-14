package Tests;

import Base.BaseTest;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AddUsers extends BaseTest {

    @BeforeMethod
    public void pageSetUp() {
        driver.navigate().to("https://demoqa.com/");
        scrollToElement(homepagePage.getElementsButton().get(0));
        homepagePage.clickOnCard("Elements");
        sidebarPage.clickOnButton("WebTables");
    }

    public void removeAllRecord() {
        while (webTablesPage.rowsFilled()>0) {
            webTablesPage.clickOnDelete();
        }
    }

    @Test
    public void addOneUser() {
        removeAllRecord();
        webTablesPage.clickOnAddButton();

        String firstName = excelReader.getStringData("Sheet1", 0, 0);
        String lastName = excelReader.getStringData("Sheet1", 0, 1);
        String email = excelReader.getStringData("Sheet1", 0, 2);
        String age = String.valueOf(excelReader.getIntegerData("Sheet1", 0, 3));
        String salary = String.valueOf(excelReader.getIntegerData("Sheet1", 0, 4);
        String department = excelReader.getStringData("Sheet1", 0, 5);

        registrationFormPage.inputFirstName(firstName);
        registrationFormPage.inputLastName(lastName);
        registrationFormPage.inputEmail(email);
        registrationFormPage.inputAge(age);
        registrationFormPage.inputSalary(salary);
        registrationFormPage.inputDepartment(department);
        registrationFormPage.clickOnSubmitButton();

        Assert.assertEquals(webTablesPage.rowsFilled(), 1);
        Assert.assertEquals(webTablesPage.getCell().get(0).getText(), firstName);
        Assert.assertEquals(webTablesPage.getCell().get(1).getText(), lastName);
        Assert.assertEquals(webTablesPage.getCell().get(2).getText(),age);
        Assert.assertEquals(webTablesPage.getCell().get(3).getText(),email);
        Assert.assertEquals(webTablesPage.getCell().get(4).getText(),salary);
        Assert.assertEquals(webTablesPage.getCell().get(5).getText(),department);

    }
    @Test
    public void addMultipleUsers() {
    }
}
