package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DoubleClickAndRightClick {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
	
	
		WebElement doubleclickelement = driver.findElement(By.xpath("//*[@id='double-click']"));
	
		Actions act = new Actions(driver);
		
//		to perform double click operation
		
//		act.doubleClick(doubleclickelement).perform();
		
//		to perform right click operation
		
		act.contextClick(doubleclickelement).perform();
		
		
	}

}
