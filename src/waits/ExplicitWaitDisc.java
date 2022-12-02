package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ExplicitWaitDisc {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		 WebElement button = driver.findElement(By.xpath("//*[@id='enable-button']"));
		 
		 button.click();
		 
		WebElement disblebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		
		
		
		
		
		
	}

}
