package d_10_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

import java.net.Socket;
import java.time.Duration;
import java.util.List;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "E:\\Backup 80GB\\IT boot camp\\documents\\Projekti\\vezbaTst2\\src\\main\\resources\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
        //    WebDriver driver1 = new EdgeDriver();
        //     driver.manage().window().minimize();

        String url = "https://s.bootsnipp.com/iframe/Dq2X";
        driver.get(url);
        List<WebElement> lista = driver.findElements(By.className("close"));
        for (int i = 0; i < lista.size(); i++) {

            lista.get(i).click();
            Thread.sleep(500);
            if (elementExist(driver, By.xpath("//div[last()]//span[contains(@class, 'glyphicon')]"))) {
                System.out.println("Close dugme postoji.");
            } else {
                System.out.println("Close dugme ne postoji.");
            }

            Thread.sleep(500);
        }

        Thread.sleep(500);
        driver.quit();
    }

    public static boolean elementExist(WebDriver driver, By close) {
        boolean elementExist = true;
        try {
            driver.findElement(close);
        } catch (Exception e) {
            elementExist = false;
        }
        return elementExist;

    }
}