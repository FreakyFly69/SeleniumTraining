package testngdiscussion;

import org.testng.annotations.Test;

public class InvocationCountKeyword {
	
	@Test(invocationCount = 5, priority = 1)
	public void titleCheck()
	{
		System.out.println("Title check test case");
	}

}
