package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun = false,
		plugin= {"pretty",
				"html:target/reports/HtmlReport.html",
				"rerun:target/failed_scenario.txt",
				"usage:target/reports/UsageReport",
				"json:target/reports/JsonReport.json",
				"junit:target/reports/JUnitReport.xml"
				
				
		})
public class GooglePageRunner {


}
