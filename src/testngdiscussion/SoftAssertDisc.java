package testngdiscussion;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertDisc {
	
	
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
		
		SoftAssert sa = new SoftAssert();
		
		sa.assertEquals(ispresent, true);
			
		System.out.println("This is the last line of the testcase");
		
		sa.assertAll();
	}

}
