package actionsclass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UploadFile {
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://chercher.tech/practice/practice-pop-ups-selenium-webdriver");
		
		
		WebElement fileuploderbutton = driver.findElement(By.xpath("//*[@name='upload']"));
	
		fileuploderbutton.sendKeys("F:\\Desktop\\Katraj\\20 Aug Katraj\\Selenium\\Selenium docs\\Locator.docx");
	
	
	}

}
