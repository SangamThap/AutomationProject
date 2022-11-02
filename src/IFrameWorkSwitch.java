import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameWorkSwitch {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://thulotechnology.github.io/SampleTestWebsite");
        driver.switchTo().frame("ourframe");
        WebElement clickHere = driver.findElement(By.xpath("//*[@id=\"body-inner\"]/div[1]/h3/a"));
        clickHere.click();
driver.switchTo().defaultContent();
driver.findElement(By.id("num1")).sendKeys("50");
        driver.switchTo().frame("ourframe");
        WebElement introduction = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[1]/a"));
        introduction.click();
        Thread.sleep(2000);

        WebElement install = driver.findElement(By.xpath("//*[@id=\"content-wrapper\"]/ul/li[1]/ul/li[2]/a"));
        install.click();



    }
}
