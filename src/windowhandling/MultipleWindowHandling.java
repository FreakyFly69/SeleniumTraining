package windowhandling;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MultipleWindowHandling {
		
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		String parentid = driver.getWindowHandle();
		
		System.out.println("parent id before clicking: "+parentid);
		
//		click on learn more link to open in a new tab
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
		driver.findElement(By.xpath("//*[@id='non-users-notice-link']")).click();
		
//	get all window id using windowHandles()	
		Set<String> allwinid = driver.getWindowHandles();
		
		int numberodwindows = allwinid.size();
		
		System.out.println(numberodwindows);
		
//		Creating an array to collect all id
		String [] winid = new String [numberodwindows];
	
//		filling the array with winid
	int i =0;	
		for(String id:allwinid)
		{
			winid[i]= id;
			
			i++;
		}
		
		
		driver.switchTo().window(winid[2]);
		
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("searching operation");
		
	}

}
