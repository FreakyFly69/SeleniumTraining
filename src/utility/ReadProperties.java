package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class ReadProperties {
	
	
	public static void main(String[] args) throws IOException {
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"//config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		
		String value = prop.getProperty("browser");
		
		System.out.println(value);	
		WebDriver driver;
		
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
		
		
		
	}

}
