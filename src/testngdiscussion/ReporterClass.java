package testngdiscussion;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class ReporterClass {
	
	

	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login testcase");
		Reporter.log("Login test got passed", true);
		
	}
	
	

	@Test
	public void home()
	{
		System.out.println("home testcase");
		Reporter.log("Home test got passed", true);
	}
	
	
	@Test(priority = -3)
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
