package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features ={"src/test/resources/appFeatures/Search.feature"},
        glue = {"stepDefinitions", "hooks"},
        tags = "@Smoke or @Regression",
        plugin = {"pretty"}
)

public class AmazonTest {

}
