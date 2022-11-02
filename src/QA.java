import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class QA {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.indeed.com/");

        WebElement searchBox = driver.findElement(By.name("q"));
        searchBox.sendKeys("junior QA");
        searchBox.submit();
    }
}
