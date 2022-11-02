import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;

public class MultipleTab {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        //1.open webdriver university
        driver.get("https://webdriveruniversity.com/");
        //2.click contact us
        driver.manage().window().maximize();
       WebElement contactUs = driver.findElement(By.xpath("//*[@id=\"contact-us\"]/div/div[1]/h1"));
        Thread.sleep(2000);
        contactUs.click();
        ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
        System.out.println(tabs.size());

        //3Go to other tab
        driver.switchTo().window(tabs.get(1));

        //4.enters details
        driver.findElement(By.name("first_name")).sendKeys("Sangam");
        driver.findElement(By.name("last_name")).sendKeys("Thapa");
        driver.findElement(By.name("email")).sendKeys("Sangamthapa@gmail.com");
        driver.findElement(By.name("message")).sendKeys("Sangam");
        Thread.sleep(2000);

        //5 click submit button
        driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]")).click();

    }
}
