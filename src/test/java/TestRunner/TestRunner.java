package TestRunner;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"json:target/destination/cucumber.json","pretty", "html:target/cucumber/report.html"},

        glue = {"src/test/java/StepDefinitions"},
        features = "/Users/renganathan/Documents/Flight_Booking/Features/Train_Booking.feature"
)


public class TestRunner
{

}
