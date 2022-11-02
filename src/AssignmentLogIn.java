import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AssignmentLogIn {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open website
        driver.get("http://www.webdriveruniversity.com/Login-Portal/index.html");
        //finding webelement and sending keys
        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("webdriver");

        WebElement password = driver.findElement(By.xpath("//*[@id=\"password\"]"));
        password.sendKeys("webdriver123");

//clicking login button
        WebElement login = driver.findElement(By.id("login-button"));
        login.click();








    }
}
