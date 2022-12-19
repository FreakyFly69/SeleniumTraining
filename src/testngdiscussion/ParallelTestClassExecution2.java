package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class ParallelTestClassExecution2 {
	
	@Test
	public void facebookTest()
	{
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//input[@name='firstname']"));

		firstname.sendKeys("Velocity");

		WebElement lastname = driver.findElement(By.xpath("//input[@name='lastname']"));

		lastname.sendKeys("Corporate");

		WebElement mobilenumber = driver.findElement(By.xpath("//*[contains(@id,'u_0_g_')]"));
		
		mobilenumber.sendKeys("9988776655");
		
		
		WebElement text = driver.findElement(By.xpath("//*[text()='Create a new account']"));
		
		String message = text.getText();
		
		System.out.println(message);
		
	}
	

}
