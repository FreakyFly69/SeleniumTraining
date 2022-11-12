package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypeOfLocator2 {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	
		Thread.sleep(2000);
		
//		By name
		
		WebElement usernamefield = driver.findElement(By.name("username"));
		
		usernamefield.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.name("password"));
		
		password.sendKeys("hsdafsdkjgfkjads");
		
		
//		By Classname
		
//	WebElement forgotpassword = driver.findElement(By.className("orangehrm-login-forgot"));
//		
//	forgotpassword.click();
	
	
//	By linkText
	
	WebElement forgotpasswordlink = driver.findElement(By.partialLinkText("Forgot your password? "));
	
	forgotpasswordlink.click();
	
	
	
	}

}
