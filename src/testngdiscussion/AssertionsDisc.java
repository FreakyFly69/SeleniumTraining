package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertionsDisc {
	
	WebDriver driver;
	@Test(priority = 1)
	public void validateTitle()
	{

		driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		String titleofpage = driver.getTitle();
		
		System.out.println(titleofpage);
		
		boolean ispresent = titleofpage.contains("Electronics");
		
		Assert.assertEquals(ispresent, true);
		
		System.out.println("This is the last line of the testcase");
		
		
	}

	
	@Test(priority = 2)
	public void validateText()
	{
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	
	firstname.sendKeys("firstname");
	
	String textpresentinsidetextfield = firstname.getAttribute("value");
	
	Assert.assertEquals(textpresentinsidetextfield, "firstname");
		
	}
	
	@Test(priority = 3)
	public void isDisplayingOnPage()
	{
		WebElement element = driver.findElement(By.xpath("//div[@id='reg_error_inner']"));
		
		boolean gettingdisplay = element.isDisplayed();
		
//		Assert.assertTrue(gettingdisplay, "Test case fail please raise a bug");
		
		Assert.assertFalse(gettingdisplay, "Test case fail please raise a bug");
	
	
	}
}
