package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DoubleWindowHandling {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println("parent id before clicking: "+parentid);
		
//		click on learn more link to open in a new tab
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@name='firstname']")).sendKeys("firstname");
		
		String parentid2 = driver.getWindowHandle();
		
		System.out.println("parent id2 after clicking: "+parentid2);
		
		System.out.println("*****************************************************");
		
//		To get the id of all windows:
		
	Set<String> allwinid = driver.getWindowHandles();
	
	
	for(String winid:allwinid)
	{
		if(!(winid.equals(parentid)))
				{
//				Switching from parent window to child window 	
			driver.switchTo().window(winid);
				}
		
		System.out.println(winid);
	}
//	performing action on child window id
	driver.findElement(By.xpath("//*[@type='search']")).sendKeys("searching operation");
		
//	switching again to the parent window and performing the actions
	driver.switchTo().window(parentid);
	
	driver.findElement(By.xpath("//*[contains(@id,'u_0_4_')]")).click();
		
	}

}
