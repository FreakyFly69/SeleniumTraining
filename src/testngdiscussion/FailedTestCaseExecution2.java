package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class FailedTestCaseExecution2 {
	@Test(priority = 1)
	public void editProfile()
	{
		System.out.println("Edit profile testcase");
	}
	
	

	@Test(priority = 2)
	public void deleteProfile()
	{
		System.out.println("delete profile testcase");
		Assert.fail();
		
	}
	
	
	@Test(priority = 3 )
	public void closeBrowser()
	{
		System.out.println("close browser testcase");
	}
	
	
	
}
