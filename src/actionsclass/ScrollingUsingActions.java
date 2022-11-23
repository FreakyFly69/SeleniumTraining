package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ScrollingUsingActions {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
		WebElement australialink = driver.findElement(By.xpath("//*[text()='Australia']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
//		act.scrollByAmount(0, 100).perform();
		
		act.scrollToElement(australialink).perform();
		
	}

}
