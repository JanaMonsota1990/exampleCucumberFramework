package BoredAPIFeatureTests;

import cucumber.api.CucumberOptions;
import io.cucumber.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "classpath:BoredAPIFeatureTests",
        glue = "classpath:BoredAPIStepDefinition"

)

public class TestRunner {
}
