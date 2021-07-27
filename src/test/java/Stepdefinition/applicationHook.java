package Stepdefinition;

import java.util.Properties;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.Before;
import qafactory.Configreader;
import qafactory.Driverfactory;

public class applicationHook {

	private static Driverfactory driverfactory;
	private static WebDriver driver;
	private Configreader configreader;
	Properties prop;
	private static String targeturl;
	
	@Before(order = 0)
	public void getproperty()
	
	{
		configreader = new Configreader();
		prop=configreader.init_prop();
		
	}
	
	@Before(order = 1)
	public void lauchbrowser()
	
	{
		String browsername = prop.getProperty("browser");
		driverfactory = new Driverfactory();
		driver =driverfactory.init_driver(browsername);
		
	}
	
	@Before(order = 2)
public void targetUrl()
	
	{
		String TargetUrl = prop.getProperty("url");
	 targeturl =driverfactory.set_target_URL(TargetUrl);
		driver.get(targeturl);
	}
	
}
