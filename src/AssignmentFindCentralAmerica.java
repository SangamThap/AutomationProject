import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

public class AssignmentFindCentralAmerica {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.justwatch.com/");
        driver.manage().window().maximize();
        Thread.sleep(2000);
//xpath of central America countries list
       WebElement centralAmerica = driver.findElement(By.xpath("//*[@id=\"base\"]/div/div/div/div[2]/div[5]/div/div[2]/div[3]/div[2]"));
        List<WebElement> allCountries = centralAmerica.findElements(By.tagName("a"));
        for (WebElement w : allCountries) {

            System.out.println(w.getText());
        }
    }
}
