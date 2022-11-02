import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class AutoComplete {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Autocomplete-TextField/autocomplete-textfield.html");
        Thread.sleep(5000);
        WebElement foodItems = driver.findElement(By.id("myInput"));
        foodItems.sendKeys("a");
       // driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);

WebElement asparagus = driver.findElement(By.cssSelector("#myInputautocomplete-list > div:nth-child(1)"));
 asparagus.click();
 Thread.sleep(2000);
       WebElement submit = driver.findElement(By.xpath("//*[@id=\"submit-button\"]"));
       submit.click();
    }
}
