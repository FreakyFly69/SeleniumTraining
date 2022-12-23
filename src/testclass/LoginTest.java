package testclass;

import org.testng.Assert;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest
{
		
	@Test(priority = 2)
	public void verifyLogin()
	{
		loginpage.enterUsername();
		
		loginpage.enterPassword();
		
		loginpage.finalSignin();
	}
	
	
	@Test(priority = 1)
	public void validateTitle()
	{
		String actualtitle = loginpage.getTitleOfPage();
		
		boolean ispresent = actualtitle.contains("Shopping");
		
		Assert.assertEquals(ispresent, true);
	}

}
