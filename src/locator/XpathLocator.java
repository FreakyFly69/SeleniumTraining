package locator;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.Screenshot;

public class XpathLocator {

//	syntax: 

	// tagname[@attribute_name = 'attribute_value']
	
//	or
	
	// *[@attribute_name = 'attribute_value']

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		firstname.sendKeys("Velocity");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

		lastname.sendKeys("Corporate");
		
//		contains():
		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("9988776655");
		
		Screenshot sc = new Screenshot();
		
		sc.captureScreenShot(driver, "facebook scrshot");
		
		
//		indexing:
		
		
//		driver.findElement(By.xpath("(//*[@class='oxd-main-menu-item'])[1]")).click();
		
// text()
		
		WebElement text = driver.findElement(By.xpath("//*[text()='Create a new account']"));
		
		String message = text.getText();
		
		System.out.println(message);
		
		
		
		
	}

}
