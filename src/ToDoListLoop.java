import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.security.Key;

public class ToDoListLoop {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        driver.get("http://www.webdriveruniversity.com/To-Do-List/index.html");

        String[] tasks = {"get up","study","eat breakfast", "work"};
        driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[1]")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[2]")).click();
        driver.findElement(By.xpath("//*[@id=\"container\"]/ul/li[3]")).click();

        for(int i = 0;i< tasks.length;i++){
            WebElement box =driver.findElement(By.xpath("//*[@id=\"container\"]/input"));
                  box.sendKeys(tasks[i]);
                  box.sendKeys(Keys.ENTER);
                  Thread.sleep(2000);
                  Thread.sleep(5000);


        }
    }
}
