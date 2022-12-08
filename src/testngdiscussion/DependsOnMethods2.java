package testngdiscussion;

import org.testng.annotations.Test;

public class DependsOnMethods2 {
	
	
	@Test(priority = 6 ,dependsOnMethods = "testngdiscussion.DependsOnMethodKeyword.logout")
	public void updateProfile()
	{
		System.out.println("update profile testcase");
		
	}
	
	

	@Test(priority = 7)
	public void deleteProfile()
	{
		System.out.println("delete profile testcase");
		
	}

}
