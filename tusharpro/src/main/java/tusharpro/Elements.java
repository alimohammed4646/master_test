package tusharpro;

import org.openqa.selenium.By;

import java.util.concurrent.TimeUnit;

/**
 * Created by ali1 on 17/08/2017.
 */
public class Elements extends DriverManager {

    public void isOnSearchPAge()
    {
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    }

    public void searchForProduct(){
        driver.findElement(By.id("twotabsearchtextbox")).sendKeys("iPhone");
        driver.findElement(By.className("nav-input")).click();

    }

    public void seeTheRelevantProduct(){
        driver.findElement(By.id(""));
    }




}
