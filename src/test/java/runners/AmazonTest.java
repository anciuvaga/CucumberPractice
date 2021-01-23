package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/appFeatures"},
        glue = {"stepDefinitions"},
        plugin = {"pretty"}
)

public class TestRunner {

}
