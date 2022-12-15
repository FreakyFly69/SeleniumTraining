package testngdiscussion;

import org.testng.annotations.Test;

public class GroupingOfTestCase2 {

	@Test(groups = "Sanity")
	public void deleteProfile()
	{
		System.out.println("delete profile testcase");
	}
	
	

	@Test(groups = "Regression" )
	public void addProfile()
	{
		System.out.println("Add profile testcase");
	}
	
	
	@Test(groups = "Functional")
	public void closeBrowser()
	{
		System.out.println("Close browser testcase");
	}
	
	
	@Test(groups = "Sanity")
	public void profile()
	{
		System.out.println("profile testcase");
	}
	
	
	
	
}
