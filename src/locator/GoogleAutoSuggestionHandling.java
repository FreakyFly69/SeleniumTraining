package locator;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoogleAutoSuggestionHandling {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");
		
		
		driver.findElement(By.xpath("//*[@name='q']")).sendKeys("Selenium");
		
		Thread.sleep(2000);
		
		
		List<WebElement> suggestions = driver.findElements(By.xpath("//ul[@jsname='bw4e9b']//div[@class='eIPGRd']"));
	
				for(WebElement result:suggestions)
				{
					String actualtext = result.getText();
					
					System.out.println(actualtext);
					
					if(actualtext.equals("selenium webdriver"))
					{
						result.click();
						
						break;
					}
				}
	
	
	
	}

}
