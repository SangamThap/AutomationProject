import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;

public class MultipleScreenShot {
    public static void main(String[] args) throws IOException {
        System.setProperty("webdriver.chrome.driver","chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        HashMap<String,String> websites= new HashMap<String, String>();
        websites.put("google", "https://google.com");
        websites.put("amazon", "https://amazon.com");
        websites.put("facebook", "https://facebook.com");
        websites.put("youtube", "https://youtube.com");

        for(String i : websites.keySet()){
            System.out.println(websites.get(i));

            driver.get(websites.get(i));
            File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

            FileUtils.copyFile(src,new File("C:\\Users\\meght\\OneDrive\\Desktop\\screenshot\\"+i+".png"));
        }
    }
}
