package Tests;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class RegistrationFormPage {

    WebDriver driver;
    WebElement firstName, lastName, email, age,salary, department, submitButton;

    public RegistrationFormPage(WebDriver driver) {
        this.driver = driver;
    }

    public WebElement getSubmitButton() {
        return driver.findElement(By.id("submit"));
    }

    public WebElement getFirstName() {
        return driver.findElement(By.id("firstName"));
    }

    public WebElement getLastName() {
        return driver.findElement(By.id("lastName"));
    }

    public WebElement getEmail() {
        return driver.findElement(By.id("userEmail"));
    }

    public WebElement getAge() {
        return driver.findElement(By.id("age"));
    }

    public WebElement getSalary() {
        return driver.findElement(By.id("salary"));
    }

    public WebElement getDepartment() {
        return driver.findElement(By.id("department"));
    }

    //------------------------------------------

    public void inputFirstName(String firstName) {
        getFirstName().clear();
        getFirstName().sendKeys(firstName);
    }

    public void inputLastName(String lastName) {
        getLastName().clear();
        getLastName().sendKeys(lastName);
    }

    public void inputEmail(String email) {
        getEmail().clear();
        getEmail().sendKeys(email);
    }

    public void inputAge(String age) {
        getAge().clear();
        getAge().sendKeys(age);
    }

    public void inputSalary(String salary) {
        getSalary().clear();
        getEmail().sendKeys(salary);
    }

    public void inputDepartment(String department) {
        getDepartment().clear();
        getDepartment().sendKeys(department);
    }

    public void clickOnSubmitButton() {
        getSubmitButton().click();
    }
}
