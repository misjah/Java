package d13_06_2022;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.io.File;
import java.time.Duration;

class Zadatak1_1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.edge.driver", "src/main/resources/msedgedriver.exe");
        WebDriver driver = new EdgeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        driver.get("https://boomf.com/apps/proxy/boomf-bomb/i-bloody-love-you");
        driver.manage().window().maximize();

        driver.findElement(By.xpath("//img[@class='sc-ezWOiH fendym']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File pic1 = new File("src/main/java/d13_06_2022/Screen Shot 06-14-22 at 08.02 PM.PNG");
        driver.findElement(By.id("imageUpload")).sendKeys(pic1.getAbsolutePath());
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 1));

        driver.findElement(By.xpath("//img[@loading='lazy']")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//img[@alt='image 2']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File pic2 = new File("src/main/java/d13_06_2022/Screen Shot 06-14-22 at 08.26 PM.PNG");
        driver.findElement(By.id("imageUpload")).sendKeys(pic2.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 2));
        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//img[@alt='image 3']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File pic3 = new File("src/main/java/d13_06_2022/Screen Shot 06-14-22 at 09.20 PM.PNG");
        driver.findElement(By.id("imageUpload")).sendKeys(pic3.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 3));
        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//img[@alt='image 4']")).click();
        driver.findElement(By.xpath("//div[contains(text(), '+ Add photo')]")).click();

        File pic4 = new File("src/main/java/d13_06_2022/Screen Shot 06-14-22 at 09.22 PM.PNG");
        driver.findElement(By.id("imageUpload")).sendKeys(pic4.getAbsolutePath());

        wait.until(ExpectedConditions.numberOfElementsToBe(By.xpath("//div[@class='sc-gKXOVf haLJiC']"), 4));
        driver.findElement(By.xpath("//div[contains(@class, 'sc-ftvSup kAzmBp')]/div[last()]/div/img")).click();
        driver.findElement(By.xpath("//button [contains (text(), 'Use One Side Only')]")).click();

        driver.findElement(By.xpath("//div[@class='sc-jhzXDd hzjUi']")).click();
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        WebElement popup = driver.findElement(By.xpath("//*[@action='error']"));
        if (popup.getAttribute("action").equals("error")) {
            System.out.println("Javlja se greska!");
        } else {
            System.out.println("Ne javlja se greska! ");
        }

  //      driver.quit();
    }
}