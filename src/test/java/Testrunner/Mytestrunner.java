package Testrunner;


	import org.junit.runner.RunWith;

	import io.cucumber.junit.Cucumber;
	import io.cucumber.junit.CucumberOptions;
import pagesimplementation.loginpage;

	@RunWith(Cucumber.class)
	@CucumberOptions(
			features = {"Resource/featurefile/login.feature"},
			glue = {"Stepdefinition"}
			/*plugin = {"pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"
					
			}*/

			
			)

	
	public class Mytestrunner {
		
}
