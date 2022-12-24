package testngdiscussion;

import java.util.Set;
import java.util.concurrent.TimeUnit;

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

	
	static WebDriver driver;
	@Test(priority = 1)
	public void navToUrl()
	{
		driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.amazon.in/");
		
		WebElement cart = driver.findElement(By.xpath("//*[@id='nav-cart']"));
		
		boolean isdisp = cart.isDisplayed();
		
//		Assert.assertTrue(false);
		
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
		
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("email");
		driver.findElement(By.xpath("//input[@id='continue']")).click();
		
	}
	
	
	@Test(priority = 3)
	public void enterPassword()
	{
		driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("password");
		driver.findElement(By.xpath("//input[@id='signInSubmit']")).click();
		
		
		
	}
	
	
	@Test(priority = 4)
	public void getTitleOfpage() throws InterruptedException
	{
//		String title = driver.getTitle();
//		
//		boolean ispresent = title.contains("India");
//		
//		Assert.assertTrue(false);
		driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
		
		driver.findElement(By.xpath("//*[@id='twotabsearchtextbox']")).sendKeys("mobile phone");
		
		driver.findElement(By.xpath("//*[@id='nav-search-submit-button']")).click();
		
		driver.findElement(By.xpath("(//*[@data-asin='B07WJV6P1R']//h2//a)[1]")).click();
		
		String parent = driver.getWindowHandle();
		
		Set<String> allwin = driver.getWindowHandles();
		
		for(String id :allwin)
		{
			if(!(id.equals(parent)))
			{
				driver.switchTo().window(id);
			}
		}
		
		
		driver.findElement(By.xpath("//*[@id='add-to-cart-button']")).click();
		
	}
	
	


}
