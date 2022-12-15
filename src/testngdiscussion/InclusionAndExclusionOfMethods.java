package testngdiscussion;

import org.testng.annotations.Test;

public class InclusionAndExclusionOfMethods {
	
	@Test
	public void login()
	{
		System.out.println("Login testcase");
	}
	
	

	@Test(priority = 2)
	public void home()
	{
		System.out.println("home testcase");
	}
	
	
	@Test(priority = 1)
	public void timeline()
	{
		System.out.println("timeline testcase");
	}
	
	
	@Test
	public void profile()
	{
		System.out.println("profile testcase");
	}
	
	
	@Test
	public void logout()
	{
		System.out.println("logout testcase");
	}
	
	@Test
	public void updateProfile()
	{
		System.out.println("update testcase");
	}
	

}
