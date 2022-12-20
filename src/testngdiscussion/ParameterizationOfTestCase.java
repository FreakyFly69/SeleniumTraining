package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationOfTestCase {
	WebDriver driver ;
	
	
	@Parameters("browser")
	@Test
	public void testCase1(String argument)
	{
		System.out.println("Test case 1 is executing ");
		
		System.out.println("The value is "+argument);
	}
	
	
	@Parameters({"browser", "environment"})
	@Test
	public void launchBrowser(String value, String env)
	{		
		if(value.equals("Chrome"))
		{
			driver = new ChromeDriver();
		}
		else if(value.equals("firefox"))
		{
			driver = new FirefoxDriver();
		}
		
		
		System.out.println("Environment used is "+env);
		
		
	}
	
	
}
