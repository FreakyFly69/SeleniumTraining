package testngdiscussion;

import org.testng.annotations.Test;

public class TimeOutKeyword {

	@Test(timeOut = 2000)
	public void titleCheck() throws InterruptedException
	{
		System.out.println("Title check test case");
		
		Thread.sleep(3000);
	}
	
	
	
	
}
