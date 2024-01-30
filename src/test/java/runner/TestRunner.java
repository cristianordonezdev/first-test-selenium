package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resourses", // Folder of .features files
        glue = "src/test/java/steps", // Classes of steps / tests
        plugin = { "pretty", "html:target/cucumber-reports"} //To generate a report
) 


public class TestRunner {
    
}
