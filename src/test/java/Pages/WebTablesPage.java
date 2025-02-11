package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class WebTablesPage {

    WebDriver driver;
    WebElement tableRow;
    WebElement addButton;
    WebElement deleteButton;
    WebElement cell;

    public WebElement getAddButton() {
        return driver.findElement(By.id("addNewRecordButton"));
    }

    public WebElement getDeleteButton() {
        return driver.findElement(By.cssSelector("span['Delete']"));
    }

    public WebTablesPage(WebDriver driver) {
        this.driver = driver;
    }

    public List<WebElement> getTableRow() {
        return driver.findElements(By.className("rt-tr-group"));
    }

    public List<WebElement> getCell() {
        return driver.findElements(By.className("rt-td"));
    }
    //---------------------------

    public void getRowText() {
        for (int i = 0; i < getTableRow().size(); i++) {
            System.out.println("Row number: " + i+1);
            boolean isEmpty = getTableRow().get(i).getText().isBlank();
            System.out.println(isEmpty);
        }
    }

    public int rowsFilled() {
        int counter = 0;
        for (int i = 0; i < getTableRow().size(); i++) {
            if (!getTableRow().get(i).getText().isBlank()) {
                counter++;
            }
        }
        return counter;
    }

    public boolean threeRowsFilled() {
        int counter = 0;
        for (int i = 0; i < getTableRow().size(); i++) {
            if (!getTableRow().get(i).getText().isBlank()) {
                counter++;
            }
        }
        if (counter == 3) {
            return true;
        } else {
            return false;
        }
    }

    public void clickOnDelete() {
        getDeleteButton().click();
    }

    public void clickOnAddButton () {
        getAddButton().click();
    }



}