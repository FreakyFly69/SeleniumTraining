package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestionHandling {
	
	
	public static void main(String[] args) {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		
		driver.findElement(By.xpath("//ul[@jsname='bw4e9b']//div[@class='eIPGRd']"));
	}

}
