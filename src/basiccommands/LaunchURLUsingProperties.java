package basiccommands;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import utility.ReadProperties;

public class LaunchURLUsingProperties {
	
	
	public static void main(String[] args) throws IOException {
		WebDriver driver;
		
		String value = ReadProperties.readProp("browser");
		
		if(value.equalsIgnoreCase("chrome"))
		{
			 driver =  new ChromeDriver();
		}
		
		else if(value.equalsIgnoreCase("Edge"))
		{
			driver = new EdgeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		String url = ReadProperties.readProp("environment");
		
		driver.get(url);
		
		
		
	}

}
