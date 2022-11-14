package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocator3 {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		
//		WebElement firstname = driver.findElement(By.className("inputtext _58mg _5dba _2ph-"));
//		
//		firstname.sendKeys("firstname");
		
		
//		WebElement alreadyaccountlink = driver.findElement(By.linkText("Already have an account?"));
//	
//		alreadyaccountlink.click();
		
//		partial link text
				
		WebElement link2 = driver.findElement(By.partialLinkText("have an account?"));
			
		link2.click();
		
//		tagname
		
		WebElement firstname = driver.findElement(By.tagName("input"));
		
		firstname.sendKeys("Firstname");
		
		
	}

}
