import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Newclass {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.imdb.com/");
        WebElement box = driver.findElement(By.name("q"));
        box.sendKeys( "Godfather");
        box.submit();
    }
}
