import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBox {public static void main(String[] args) {


    System.setProperty("webdriver.chrome.driver","chromedriver.exe");
    WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
WebElement checkbox = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[3]"));
checkbox.click();
WebElement option = driver.findElement(By.xpath("//*[@id=\"checkboxes\"]/label[2]"));
option.click();
driver.close();


}}
