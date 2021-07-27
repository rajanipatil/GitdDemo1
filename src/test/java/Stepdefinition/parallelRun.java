package Stepdefinition;

import io.cucumber.junit.CucumberOptions;
import org.testng.annotations.DataProvider;

//import cucumber.api.testng.AbstractTestNGCucumberTests;




public class parallelRun

{
		
	@CucumberOptions(
			/*plugin = {"pretty",
					"com.aventstack.extentreports.cucumber.adapter.ExtentCucumberAdapter:",
					"timeline:test-output-thread/"
					}, */
			monochrome = true,
			glue = { "parallel" },
			features = { "src/test/resources/parallel" }
	)

	public class ParallelRun extends io.cucumber.testng.AbstractTestNGCucumberTests
	{
		@DataProvider(parallel = true)
		public Object[][] scenarios()
		{
			return super.scenarios();
		}
	
	
	}
}


