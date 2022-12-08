package testngdiscussion;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodKeyword {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login testcase");
		
	}
	
	

	@Test(dependsOnMethods = "login", priority = 2)
	public void home()
	{
		System.out.println("home testcase");
		
	}
	
	
	@Test(priority = 3, dependsOnMethods = "home" )
	public void timeline()
	{
		System.out.println("timeline testcase");
		
		Assert.fail("failed deliberately to check depends on method");
		
	}
	
	
	@Test(priority = 4, dependsOnMethods = {"home", "timeline"})
	public void profile()
	{
		System.out.println("profile testcase");
		
	}
	
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout testcase");
		
		Assert.fail();
	}

}
