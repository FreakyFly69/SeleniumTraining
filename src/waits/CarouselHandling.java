package waits;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CarouselHandling {
	
	
	public static void main(String[] args) {
			
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		
		driver.get("https://www.flipkart.com/");
		
		driver.findElement(By.xpath("//*[@class='_2KpZ6l _2doB4z']")).click();
		
		Actions act= new Actions(driver);
		
		act.moveByOffset(0, 100).perform();
		
		WebElement carouselelement = driver.findElement(By.xpath("(//*[@class='_2a3TMW'])[6]"));
		
		WebDriverWait wait =  new WebDriverWait(driver, Duration.ofSeconds(50));
		
		wait.until(ExpectedConditions.visibilityOf(carouselelement));
		
		carouselelement.click();
		
		
		 
	}

}
