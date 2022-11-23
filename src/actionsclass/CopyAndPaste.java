package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CopyAndPaste {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));
	
		Actions act = new Actions(driver);
		
//		performing CTRL + A operation
		
		act.sendKeys(firstname, "Firstname").keyDown(Keys.CONTROL).sendKeys("a").keyUp(Keys.CONTROL).build().perform();
		
		
//		performing CTRL + C operation
		
		act.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();

//		performing CTRL + V operation	
		
		act.sendKeys(Keys.TAB).keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
		
		 WebElement mobilenumber = driver.findElement(By.xpath("//*[@name='reg_email__']"));
		
		mobilenumber.sendKeys("998877665544");
		
		String enteredvalue = mobilenumber.getAttribute("value");
		
		System.out.println(enteredvalue);
		
		
		
		
	}

}
