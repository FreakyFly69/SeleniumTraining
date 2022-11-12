package basiccommands;

import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationalCommands {
	
	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
//		To maximize the browser
		
		driver.manage().window().maximize();
		
//		navigating to a url
		
		driver.get("https://www.facebook.com/signup");
		
		
		Thread.sleep(2000);
		
		driver.get("https://www.google.co.in/");
		
		Thread.sleep(2000);
		
//		browser back button
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
//		browser forward button
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
//		refreshing browser
		
		driver.navigate().refresh();
		
		

		
//	To close the browser
		
		driver.close();
		
		
		
		
	}

}
