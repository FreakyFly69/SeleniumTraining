package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DynamicXpath {
	
	public static void main(String[] args) throws InterruptedException {
		
	
	WebDriver driver = new ChromeDriver();

	driver.manage().window().maximize();

	driver.get("https://www.facebook.com/signup");
	
	
	
	for(int i=1; i<=3; i++ )
	{
		driver.findElement(By.xpath("(//*[@class='_8esa'])["+i+"]")).click();
		Thread.sleep(2000);
	}
	

	}
}
