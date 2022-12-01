package waits;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticWait {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/help/637205020878504");
		
//		static wait
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@type='search']")).sendKeys("text to type");
		
		
	}
	

}
