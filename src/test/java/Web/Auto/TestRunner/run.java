package Web.Auto.TestRunner;

import org.junit.runner.RunWith;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


	
	
	
	
	@RunWith(Cucumber.class)
	@CucumberOptions(
			
			features = "/Users/mohamedjaveedakram/eclipse-workspace/Technical.Task/Features/dragandrop.feature",
			glue = "Web.Auto.StepDefinition",
			dryRun=true,
			monochrome=true,
			plugin = {"pretty","html:Reports/cucumber-report/report1.html","json:Reports/cucumber-report/report2.json","junit:Reports/cucumber-report/report3.xml"}
			
			
			)
	
	public class run
	{
	
	

}
