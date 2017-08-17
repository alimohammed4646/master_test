package tusharpro;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

/**
 * Created by ali1 on 11/08/2017.
 */
public class DriverManager {
    public WebDriver driver = new ChromeDriver();

    public void openBrowser(){
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
        //driver = new ChromeDriver();
        //driver.get("https://www.amazon.co.uk/");
        //driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void closeBrowser(){

        //driver.quit();

    }
}
