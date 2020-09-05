package runner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features ="./src/test/java/features/white.feature" , glue = { "steps" },
dryRun= false,
monochrome = true,
plugin = {"pretty","html:test-output"}
)


public class Whitecolor {

}
