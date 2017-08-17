package tusharpro;

import cucumber.api.java.After;
import cucumber.api.java.Before;

/**
 * Created by ali1 on 11/08/2017.
 */
public class Hooks {
    @Before
    public void setup(){

        new DriverManager().openBrowser();

    }
    @After
    public void tearDown(){
        new DriverManager().closeBrowser();

    }
}
