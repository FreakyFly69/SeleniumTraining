package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;

public class FluentWaitDisc {
	
	
	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		 WebElement button = driver.findElement(By.xpath("//*[@id='enable-button']"));
		
//		 click on the button to start the timer
		 
		 button.click();
		 
		WebElement disblebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		
		
		FluentWait<WebDriver> wait = new FluentWait<WebDriver>(driver)
				.withTimeout(Duration.ofSeconds(60))
				.pollingEvery(Duration.ofSeconds(9))
				.ignoring(NoSuchElementException.class);
		
		
		wait.until(ExpectedConditions.elementToBeClickable(disblebutton));
		
		driver.findElement(By.xpath("//*[@id='checkbox']")).click();
		
		
		
		
		
		
	}

}
