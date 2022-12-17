package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class TestCase {
@BeforeMethod
public void bm()
{
	System.out.println("Before method annotations");
}

@BeforeTest
public void beforeTest()
{
	System.out.println("Before Test ");
}
	
	static WebDriver driver;
	@Test(priority = 1)
	public void navToUrl()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		
		boolean isdisp = cart.isDisplayed();
		
		Assert.assertTrue(false);
		
	}
	
	

	@Test(priority = 2)
	public void enterUsername()
	{
		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

		Actions act = new Actions(driver);

		act.moveToElement(hoverelement).perform();

		WebElement signinbutton = driver
				.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']"));
		signinbutton.click();
		
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("8176867662");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}
	
	
	@Test(priority = 3, dependsOnMethods = "navToUrl")
	public void enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("123456");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
	}
	
	
	@Test(priority = 4)
	public void getTitleOfpage()
	{
		String title = driver.getTitle();
		
		boolean ispresent = title.contains("India");
		
		Assert.assertTrue(false);
		
	}
	
	


}
