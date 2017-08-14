package com.raktest;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

/**
 * Created by ali1 on 13/08/2017.
 */

@RunWith(Cucumber.class)
//@CucumberOptions(format = {"pretty", "html:target/com.raktest", "json:target/com.raktest.json"})
@CucumberOptions(features = ".")
public class RunnerFile {


}
