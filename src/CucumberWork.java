import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CucumberWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Accordion/index.html");
        driver.manage().window().maximize();
       WebElement cucumber = driver.findElement(By.id("cucumber-accordion"));
       cucumber.click();
       Thread.sleep(6000);
       WebElement text = driver.findElement(By.xpath("//*[@id=\"cucumber-testing-description\"]"));
       text.getText();
        System.out.println(text.getText());
        driver.close();
    }
}
