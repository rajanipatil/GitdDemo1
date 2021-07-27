package pagesimplementation;

import org.openqa.selenium.WebDriver;

public class loginpage {
	
	private WebDriver driver;

public loginpage(WebDriver driver) {
	
	this.driver = driver;
		
}

public String getTitle()
{
	//String Title = driver.getTitle();
	//System.out.println("Title is: " + Title);
	return driver.getTitle();
	
}

}
