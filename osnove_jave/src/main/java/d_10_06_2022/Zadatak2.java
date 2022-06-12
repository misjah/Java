package d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;

import java.time.Duration;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {

        System.setProperty("webdriver.edge.driver", "E:\\Backup 80GB\\IT boot camp\\documents\\Projekti\\vezbaTst2\\src\\main\\resources\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //    WebDriver driver1 = new EdgeDriver();
        //     driver.manage().window().minimize();

        String url = "https://geodata.solutions/";
        driver.get(url);
        Select select_1 = new Select(driver.findElement(By.id("countryId")));
        Select select_2 = new Select(driver.findElement(By.id("stateId")));
        Select select_3 = new Select(driver.findElement(By.id("cityId")));

        select_1.selectByVisibleText("Cameroon");
        Thread.sleep(500);
        select_2.selectByVisibleText("Littoral");
        Thread.sleep(500);
        select_3.selectByVisibleText("Douala");
        Thread.sleep(2000);

        driver.quit();

    }
}
