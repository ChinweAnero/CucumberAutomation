package basic.firstFeatureFile;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, 
		//dryRun = true,
		
		features = {"src/test/resources/com/basic/FirstFeatureFileFF/"},
		glue = {"basic/firstFeatureFile/"},
		
		plugin = {"pretty", 
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report.json",
				
		}
		
		
		
		)




public class RunFeatureFileTest {
	
	
	
	
	
	
	

}
