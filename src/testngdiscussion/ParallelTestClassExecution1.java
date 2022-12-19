package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ParallelTestClassExecution1 {
	
	
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
	public void googleTest() throws InterruptedException
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.google.com/");
		
		WebElement searchbox = driver.findElement(By.xpath("//*[@name='q']"));
		
		Actions act = new Actions(driver);
		
		act.sendKeys(searchbox, "Selenium").perform();
		
		Thread.sleep(2000);
		
		act.sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ARROW_DOWN).sendKeys(Keys.ENTER).build().perform();
		
		
	}
	

}
