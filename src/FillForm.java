import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FillForm {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Contact-Us/contactus.html");

        WebElement firstName = driver.findElement(By.name("first_name"));
        firstName.sendKeys("Sita");

        WebElement lastName = driver.findElement(By.name("last_name"));
        lastName.sendKeys("Shrestha");

        WebElement email = driver.findElement(By.name("email"));
email.sendKeys("hello@gamil.com");

        WebElement message= driver.findElement(By.name("message"));
        message.sendKeys("Hello From Message");
        Thread.sleep(2000);

        WebElement submit= driver.findElement(By.xpath("//*[@id=\"form_buttons\"]/input[2]"));
        submit.click();
    }
}
