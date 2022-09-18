package runners;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(
		publish = true,
		features = "src//test//resources//features//GoogleSearch.feature",
		glue= {"stepDefs"},
		monochrome=true,
		dryRun = false,
		plugin= {"pretty",
				"html:target/cucumber/HtmlReport.html",
//				"rerun:target/failed_scenario.txt",
//				"usage:target/reports/UsageReport",
				"json:target/cucumber/JsonReport.json",
				"junit:target/cucumber/JUnitReport.xml"
				
				
		})
public class GooglePageRunner {


}
