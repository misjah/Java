package d14_06_2022;

import org.openqa.selenium.*;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

public class BootstrapTableTests {
    private WebDriver driver;
    private String baseUrl = "https://s.bootsnipp.com";

    @BeforeClass
    public void beforeClass() {
        System.setProperty("webdriver.edge.driver",
                "src/main/resources/msedgedriver.exe");
        driver = new EdgeDriver();
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

    }

    @BeforeMethod
    public void beforeMethod() {
        driver.get(baseUrl);
        driver.manage().window().maximize();

    }

    @Test(priority = 10) //Edit Row
    public void editRow() throws InterruptedException {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com", "[ERROR] The title does not contain this text");
        driver.findElement(By.xpath("//button[contains(@data-target, 'edit')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'modal-content')]")));
        driver.findElement(By.xpath("//input[contains(@placeholder, 'First')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder, 'First')]")).sendKeys("Miki");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Last')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Last')]")).sendKeys("Milic");
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Middle')]")).clear();
        driver.findElement(By.xpath("//input[contains(@placeholder, 'Middle')]")).sendKeys("Petko");

        Thread.sleep(1000);
        driver.findElement(By.id("up")).click();
        Assert.assertEquals("Miki",
                "Miki",
                "[ERROR] This is not the right input");
        Assert.assertEquals("Milic",
                "Milic",
                "[ERROR] This is not the right input");
        Assert.assertEquals("Petko",
                "Petko",
                "[ERROR] This is not the right input");
    }

    @Test(priority = 20)  //Delete Row
    public void deleteRow() {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertTrue(driver.getTitle().equals("Table with Edit and Update Data - Bootsnipp.com"),
                "[ERROR] The title does not contain this text");
        driver.findElement(By.xpath("//button[contains(@data-target, 'delete')]")).click();
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.presenceOfElementLocated(By.id("delete")));

        driver.findElement(By.xpath("//table/tbody/tr"));
        driver.findElement(By.id("del")).click();
        wait.until(ExpectedConditions.invisibilityOf(driver.findElement(By.id("delete"))));
        List<WebElement> deletedRows = driver.findElements(By.xpath("//table/tbody/tr[0]"));
        Assert.assertTrue(deletedRows.isEmpty(), "[ERROR] Row is not deleted");
    }
    @Test(priority = 30) //Take a Screenshot
    public void takeASkreenshoot() throws IOException, InterruptedException {
        driver.get(baseUrl + "/iframe/K5yrx");
        Assert.assertEquals(driver.getTitle(), "Table with Edit and Update Data - Bootsnipp.com", "[ERROR] The title does not contain this text");
        Thread.sleep(2000);
        TakesScreenshot scrShot =((TakesScreenshot)driver);
        File srcFile = scrShot.getScreenshotAs(OutputType.FILE);
        File destFile = new File("src/main/resources/screenshot.png");
        FileHandler.copy(srcFile,destFile);
    }


    @AfterClass
    public void afterClass() {
 //       driver.quit();
    }
}
