package d_09_06;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import java.util.List;
import java.util.Scanner;

public class Zadatak1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.edge.driver", "E:\\Backup 80GB\\IT boot camp\\documents\\Projekti\\vezbaTst2\\src\\main\\resources\\msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        Scanner sc = new Scanner(System.in);
             driver.manage().window().maximize();
             String url = "https://s.bootsnipp.com/iframe/WaXlr";
             driver.navigate().to(url);
        List<WebElement> lista = driver.findElements(By.xpath("//button[contains(@id,'rating-star')]"));

        System.out.print("Uneti broj u rasponu od 1 do 5: ");
        int raspon = sc.nextInt();
        for (int i = 0; i <= 5; i++) {
            if (raspon == 1){
                lista.get(0).click();
            } else if (raspon == 2) {
                lista.get(1).click();
            } else if (raspon == 3) {
                lista.get(2).click();
            } else if (raspon == 4) {
                lista.get(3).click();
            }else if (raspon == 5){
                lista.get(4).click();
            }else {
                System.out.println("Los unos!");
                driver.quit();
            }

            Thread.sleep(5000);
            driver.quit();
        }


    }
}
