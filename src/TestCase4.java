import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class TestCase4 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //to open website
        driver.get("https://webdriveruniversity.com");
        driver.manage().window().maximize();
        //to click login
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        login.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //to go to other tab
        driver.switchTo().window(tabs.get(1));
        //blenk username and password is entered
        WebElement userName = driver.findElement(By.id("text"));
        userName.sendKeys("");
        WebElement password = driver.findElement(By.id("password"));
        password.sendKeys("");
        WebElement logIn = driver.findElement(By.id("login-button"));
        logIn.click();

    }
}
