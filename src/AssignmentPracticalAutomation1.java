import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.TimeUnit;

public class AssignmentPracticalAutomation1 {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.amazon.in.");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        WebElement searchbox = driver.findElement(By.id("twotabsearchtextbox"));
        searchbox.sendKeys("iPhone XR (64GB) - Yellow.");

        WebElement search = driver.findElement(By.id("nav-search-submit-button"));
        search.click();
        WebElement phone = driver.findElement(By.xpath("//span[text()='Apple iPhone 12 (64GB) - Blue']"));
        phone.click();
        String price = driver.findElement(By.xpath("(//span[@class=\"a-price-whole\"])[5]")).getText();
        System.out.println(price);

        driver.get("https://www.flipkart.com");
        driver.switchTo().window("Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!");
        Thread.sleep(5000);
WebElement cancelButton =driver.findElement(By.xpath("/html/body/div[2]/div/div/button"));
cancelButton.click();
WebElement searchBox1 = driver.findElement(By.name("q"));
searchBox1.sendKeys("Apple iPhone 12 (64GB) - Blue");
searchBox1.submit();
//WebElement search1 = driver.findElement(By.xpath("//*[@id="container"]/div/div[1]/div[1]/div[2]/div[2]/form/div/button/svg/g/path[2]"));
//search1.click();




    }
}
