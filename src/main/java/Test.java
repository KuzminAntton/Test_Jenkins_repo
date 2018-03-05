import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class Test {
    public static void main(String[] args){

        System.setProperty("webdriver.chrome.driver", "chromedriver");

        WebDriver driver = new ChromeDriver();


        driver.get("https://gmail.com");
        WebElement element=driver.findElement(By.xpath("//input[@type='email']"));
        element.sendKeys("makes1233m@gmail.com");

        WebElement button=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));

        button.click();

        WebElement element1 = driver.findElement(By.xpath("//input[@type='password']"));

        element1.sendKeys("123makes321");

        WebElement button1=driver.findElement(By.xpath("//span[@class='RveJvd snByac']"));

        button1.click();

        driver.close();
    }
}