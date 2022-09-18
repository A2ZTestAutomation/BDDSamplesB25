package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "@target/failed_scenario.txt",
		glue= {"stepDefs"}
		)
public class RerunRunner {

}
