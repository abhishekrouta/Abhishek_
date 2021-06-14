package Cucumber.Selenium_cucumber;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty","html:target/results.html"})
//@CucumberOptions(plugin = {"pretty","json:target/cucumberjson.json"})
public class RunCucumberTest {

}
