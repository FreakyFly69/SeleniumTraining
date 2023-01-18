package webtablehandling;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class WebtableHandle {
	
	
	@Test
	public void getTableValues()
	{
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().window().maximize();

		driver.get("https://www.nyse.com/ipo-center/ipo-pricing-stats");
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(60));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//tbody//tr")));
		
		List<WebElement> row = driver.findElements(By.xpath("//tbody//tr"));

		int rowcount = row.size();
		
		System.out.println("Total rows are "+rowcount);
		
		List<WebElement> column = driver.findElements(By.xpath("//tbody//tr[1]//td"));
		
		int columncount = column.size();
		
		System.out.println("Total column are "+columncount);
		
		
		
		for(int i= 1; i<=rowcount; i++ )
		{
			for(int j=1; j<=columncount; j++)
			{
				String value = driver.findElement(By.xpath("//tbody//tr["+i+"]//td["+j+"]")).getText();
				
				System.out.print(value+ " ");
			}
			
			System.out.println();
		}

	}

}
