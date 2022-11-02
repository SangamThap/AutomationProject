import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class NewList {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Data-Table/index.html");
        WebElement job = driver.findElement(By.xpath("/html/body/div/div[9]/div[1]/ul[3]/ul"));
        List<WebElement> allElements =  job.findElements(By.tagName("li"));
        for (WebElement w : allElements) {

            System.out.println(w.getText());
        }
    }
}