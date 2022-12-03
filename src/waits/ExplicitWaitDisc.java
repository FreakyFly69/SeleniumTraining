package waits;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWaitDisc {
	
	public static void main(String[] args) {
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--incognito");
			
		WebDriver driver = new ChromeDriver(options);

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/explicit-wait-sample-selenium-webdriver");
		
		 WebElement button = driver.findElement(By.xpath("//*[@id='enable-button']"));
		
//		 click on the button to start the timer
		 
		 button.click();
		 
		WebElement disblebutton = driver.findElement(By.xpath("//*[@id='disable']"));
		
		
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(90));
		
		wait.until(ExpectedConditions.elementToBeClickable(disblebutton));
		
		
//		click on the buttton again to make the button again into disable state
		
		button.click();
		
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		
		WebElement hiddenbutton = driver.findElement(By.xpath("//*[@id='hidden']"));
		
		
		wait.until(ExpectedConditions.visibilityOf(hiddenbutton));
		
		driver.findElement(By.xpath("//*[@id='display-other-button']")).click();
		
		

		
		
		
		
	}

}
