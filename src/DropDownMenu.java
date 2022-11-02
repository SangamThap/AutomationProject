import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDownMenu {
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("http://www.webdriveruniversity.com/Dropdown-Checkboxes-RadioButtons/index.html");
        Select select = new Select(driver.findElement(By.id("dropdowm-menu-1")));
 //select with visibletext
        // select.selectByVisibleText("SQL");
      //select with value
        // select.selectByValue("sql");
        select.selectByIndex(2);
        driver.close();
    }
}
