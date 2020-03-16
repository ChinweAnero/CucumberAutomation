package basic.TagsSD;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;






@RunWith(Cucumber.class)
@CucumberOptions(
		
		monochrome = true, 
		//dryRun = true,
		tags = {"@RunThis"},
		
		glue = {"basic/TagsSD/"},
		features = {"src/test/resources/com/basic/TagsFF/"},
		
		
		plugin = {"pretty", 
				"html:target/cucumber-htmlreport",
				"json:target/cucumber-report1.json",
				
		}
		
		
		
		)




public class RunTagsTest {
	
	
	
	
	
	
	

}
