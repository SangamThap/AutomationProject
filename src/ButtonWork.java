import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonWork {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Click-Buttons/index.html");
        driver.findElement(By.xpath("//*[@id=\"button1\"]/p")).click();
        Thread.sleep(2000);
        //To close popup box
        driver.findElement(By.xpath("//*[@id=\"myModalClick\"]/div/div/div[3]/button")).click();
        driver.close();
    }
}
