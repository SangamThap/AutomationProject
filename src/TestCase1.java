import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class TestCase1 {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //open website
        driver.get("https://webdriveruniversity.com");
        driver.manage().window().maximize();
        //click login
        WebElement login = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        login.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        //go to other tab
        driver.switchTo().window(tabs.get(1));
        //enter valid username and password
WebElement userName = driver.findElement(By.id("text"));
userName.sendKeys("webdriver");
WebElement password = driver.findElement(By.id("password"));
password.sendKeys("webdriver123");
WebElement logIn = driver.findElement(By.id("login-button"));
logIn.click();


    }
}
