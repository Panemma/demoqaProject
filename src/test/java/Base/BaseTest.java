package Base;

import Pages.HomepagePage;
import Pages.SidebarPage;
import Pages.WebTablesPage;
import Tests.RegistrationFormPage;
import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;

import java.io.IOException;

public class BaseTest {
    public WebDriver driver;
    public HomepagePage homepagePage;
    public SidebarPage sidebarPage;
    public WebTablesPage webTablesPage;
    public RegistrationFormPage registrationFormPage;
    public ExcelReader excelReader;

    @BeforeClass
    public void setUp() throws IOException {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.manage().window().maximize();

        excelReader = new ExcelReader("C:\\Users\\Ema\\Desktop\\TestData.xlsx");

        homepagePage = new HomepagePage(driver);
        sidebarPage = new SidebarPage(driver);
        webTablesPage = new WebTablesPage(driver);
        registrationFormPage = new RegistrationFormPage(driver);
    }

    public void scrollToElement(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", element);
    }

    public void jsClick(WebElement element) {
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", element);
    }

}