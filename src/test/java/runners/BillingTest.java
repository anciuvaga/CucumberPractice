package runners;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = {"src/test/resources/appFeatures/BillingAmount.feature"},
        glue = {"stepDefinitions", "hooks"},
       // tags = "@All",
        plugin = {"pretty", "json:target/MyReports/report.json",
                "junit:target/MyReports/report.xml"}
        //  publish = true
        // monochrome = false,
        // dryRun = true
)

public class BillingTest {
}
