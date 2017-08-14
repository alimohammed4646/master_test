package com.raktest;

import cucumber.api.java.After;
import cucumber.api.java.Before;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import static org.junit.Assert.assertTrue;

/**
 * Created by ali1 on 13/08/2017.
 */
public class MyStepDef {

    private WebDriver driver = new ChromeDriver();;

    @Before
    public void startBrowser() {
        System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
       /* driver = new ChromeDriver();
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS); */

    }

    @After
    public void stop() {
        // driver.quit();
    }

    @Given("^as a user I am on Amazon\\.co\\.uk$")
    public void as_a_user_I_am_on_Amazon_co_uk()  {
        driver.get("https://www.amazon.co.uk/");
        driver.manage().window().maximize();
        //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

    }

    @When("^I click Sign-In button$")
    public void i_click_Sign_In_button() {
        driver.findElement(By.cssSelector("#nav-link-accountList")).click();
    }



    @When("^I enter Username and password$")
    public void i_enter_Username_and_password() {
        driver.findElement(By.name("email")).sendKeys("alimohammed4601@gmail.com");
        driver.findElement(By.name("password")).sendKeys("Abcd1234");

    }

    @Then("^I click on sing in$")
    public void i_click_on_sing_in() {

        driver.findElement(By.id("signInSubmit")).click();
    }


    @Then("^I am logged in successfully$")
    public void i_am_logged_in_successfully() {
        //Assert.assertTrue(driver.findElement(By.id("gw-sign-in-widget-welcome-section")).isDisplayed());
        //assertTrue(driver.findElement(By.cssSelector("BODY")).getText().matches("^[\\s\\S]*Hello alimohammed[\\s\\S]*$"));
        Assert.assertTrue(driver.findElement(By.tagName("body")).getText().contains("Hello, alimohammed"));

    }

}

