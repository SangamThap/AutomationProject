import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class AssignmentMultipleTab {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.open webdriver university
        driver.get("https://webdriveruniversity.com/");

        //2.click contact us
        driver.manage().window().maximize();
        WebElement logIn = driver.findElement(By.xpath("//*[@id=\"login-portal\"]/div/div[1]/h1"));
        Thread.sleep(2000);
        logIn.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(tabs.size());

        //3Go to other tab
        driver.switchTo().window(tabs.get(1));

        //4.enters details
        driver.findElement(By.id("text")).sendKeys("webdriver");
        driver.findElement(By.id("password")).sendKeys("webdriver123");

        Thread.sleep(2000);

        //5 click submit button
        driver.findElement(By.id("login-button")).click();

    }
}
