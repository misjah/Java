package d_09_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.util.Scanner;

public class Zadatak2 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "E:\\Backup 80GB\\IT boot camp\\documents\\Projekti\\vezbaTst2\\src\\main\\resources\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        Scanner sc = new Scanner(System.in);
        driver.manage().window().maximize();
        String url = "https://www.tutorialrepublic.com/snippets/bootstrap/table-with-add-and-delete-row-feature.php";
        driver.navigate().to(url);
        for (int i = 0; i < 5; i++) {
            Thread.sleep(500);
            driver.findElement(By.xpath("//button[contains(@class,'btn btn-info add-new')]")).click();
            driver.findElement(By.xpath("//input[contains(@name,'name')]")).sendKeys("Miki");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[contains(@name,'department')]")).sendKeys("Admin");
            Thread.sleep(500);
            driver.findElement(By.xpath("//input[contains(@name,'phone')]")).sendKeys("123456789");
            Thread.sleep(500);
            driver.findElement(By.xpath("//table[contains(@class,'table table-bordered')]/tbody/tr[last()]/td[last()]/a[1]")).click();
            Thread.sleep(500);

        }
        driver.quit();
    }
}
