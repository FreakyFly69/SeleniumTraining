package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class SingleTestOnMultipleBrowser {
	
	WebDriver driver;
	
	@Parameters("browser")
	@Test
	public void amazonTest(String value)
	{

		if(value.equalsIgnoreCase("chrome"))
		{
		driver = new ChromeDriver();
		}
		else
		{
			driver = new FirefoxDriver();
		}
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		
		boolean isdisp = cart.isDisplayed();
		
	}
	
	
	

}
