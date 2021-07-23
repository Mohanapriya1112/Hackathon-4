package runner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/test/resources/feature" // path of the feature file
		, glue = { "stepdefinition", "apphooks" } // path of the step definition file
		, plugin = {"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
				"pretty"
				//,"html:target/cucumber-html-report", "json:json_output/cucumber.json", "junit:junit_xml/cucumber.xml"
				}
		//, dryRun = true //to check the mapping is proper btw feature file and step definition file
//,strict = true //it will check if any step is not defined inside step definetion file
		, monochrome = true // display the console in a pretty readable mode
				,tags = "@SmokeTest"
)

public class TestRunner {

}
