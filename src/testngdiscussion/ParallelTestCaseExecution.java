package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ParallelTestCaseExecution {
	
	
	
	@Test
	public void amazonTest()
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		
		boolean isdisp = cart.isDisplayed();
		
		
	}
	
	@Test
	public void testCase2() throws InterruptedException
	{
		WebDriver driver = new FirefoxDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(searchbox, "Selenium").perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}
	
	
	@Test
	public void testCase3()
	{
		WebDriver driver = new EdgeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		firstname.sendKeys("Velocity");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

		lastname.sendKeys("Corporate");

		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("9988776655");
		
		
		WebElement text = driver.findElement(By.xpath("//*[text()='Create a new account']"));
		
		String message = text.getText();
		
		System.out.println(message);
		
	}

}
