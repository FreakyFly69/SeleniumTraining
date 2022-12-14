package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase {

	@Test(groups = "Sanity")
	public void login()
	{
		System.out.println("Login testcase");
	}
	
	

	@Test(groups = "Regression")
	public void home()
	{
		System.out.println("home testcase");
	}
	
	
	@Test(groups = "Functional")
	public void timeline()
	{
		System.out.println("timeline testcase");
	}
	
	
	@Test(groups = "Sanity")
	public void profile()
	{
		System.out.println("profile testcase");
	}
	
	
	@Test(groups = "Regression")
	public void logout()
	{
		System.out.println("logout testcase");
	}
	
	@Test
	public void updateProfile()
	{
		System.out.println("logout testcase");
	}
	
	
}
