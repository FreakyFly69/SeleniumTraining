package testngdiscussion;

import org.testng.annotations.Test;

public class EnabledKeyword {
	

	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login testcase");
	}
	
	

	@Test
	public void home()
	{
		System.out.println("home testcase");
	}
	
	
	@Test(priority = -3, enabled = false)
	public void timeline()
	{
		System.out.println("timeline testcase");
	}
	
	
	@Test(priority = 4)
	public void profile()
	{
		System.out.println("profile testcase");
		
	}
	
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout testcase");
	}
	
	

}
