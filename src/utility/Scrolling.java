package utility;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scrolling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");

		JavascriptExecutor js = (JavascriptExecutor) driver;

//		scrolling by pixel
		
//		js.executeScript("window.scrollBy(0,5000)");
		
//		Scroll to view element until it gets available
		
		WebElement todaysdeals = driver.findElement(By.xpath("//div//*[text()='See all deals']"));

		js.executeScript("arguments[0].scrollIntoView();", todaysdeals);
	
	
	
	
	}

}
