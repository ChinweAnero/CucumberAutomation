package basic.MultipleScenerioSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, 
		//dryRun = true,
		
		glue = {"basic/MultipleScenerioSD/"},
		features = {"src/test/resources/com/basic/MultipleScenerioFF/"},
		
		
		plugin = {"pretty", 
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
				
		}
		
		
		
		)




public class RunMyMultiplescenerioTest {
	
	
	
	
	
	
	

}
