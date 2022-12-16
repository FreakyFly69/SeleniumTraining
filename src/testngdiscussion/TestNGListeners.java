package testngdiscussion;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import utility.Screenshot;

public class TestNGListeners extends TestCase implements ITestListener {

	@Override
	public void onTestStart(ITestResult result) {
		System.out.println("Test case started : "+ result.getName());
	}

	@Override
	public void onTestSuccess(ITestResult result) {
		System.out.println("Test case passed : "+ result.getName());
	}

	@Override
	public void onTestFailure(ITestResult result) {
		System.out.println("Test case failed : "+ result.getName());
		
		Screenshot sc = new Screenshot();
		
		try {
			sc.captureScreenShot(driver, result.getName());
		} catch (Exception e) {
			
			String message = e.getMessage();
			
			System.out.println(message);
			
			System.out.println("Inside catch block of test failure method");
			
		}
		
	}

	@Override
	public void onTestSkipped(ITestResult result) {
		System.out.println("Test case skipped : "+ result.getName());
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result) {
		
	}

	@Override
	public void onStart(ITestContext context) {
		System.out.println("Test tag started : "+ context.getName());
	}

	@Override
	public void onFinish(ITestContext context) {
		System.out.println("Test tag finished : "+ context.getName());
	}
	

	
	
	
	
	
}
