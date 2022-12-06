package testngdiscussion;

import org.testng.annotations.Test;

public class PriorityKeyword {
	
	
	@Test(priority = 1)
	public void login()
	{
		System.out.println("Login testcase");
	}
	
	

	@Test(priority = 2)
	public void home()
	{
		System.out.println("home testcase");
	}
	
	
	@Test(priority = 3)
	public void timeline()
	{
		System.out.println("timeline testcase");
	}
	
	
	@Test(priority = 4)
	public void profile()
	{
		System.out.println("profile testcase");
		throw new ArithmeticException();
	}
	
	
	@Test(priority = 5)
	public void logout()
	{
		System.out.println("logout testcase");
	}
	
	

}
