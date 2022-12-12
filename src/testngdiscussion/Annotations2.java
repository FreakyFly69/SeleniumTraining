package testngdiscussion;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Annotations2 {
	@BeforeTest
	public void beforeTest()
	{
		System.out.println("Before Test");
	}
	
	@Test
	public void testCase3()
	{
		System.out.println("Test case 3");
	}

}
