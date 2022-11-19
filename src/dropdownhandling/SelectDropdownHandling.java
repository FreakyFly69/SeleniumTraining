package dropdownhandling;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import utility.Screenshot;

public class SelectDropdownHandling {
	
	public static void selectValueDropdown(WebElement ele, String value)
	{
		Select selday = new Select(ele);
		
		selday.selectByVisibleText(value);
	}
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		
		Select selday = new Select(day);
		
		selday.selectByVisibleText("2");
		
		 WebElement month = driver.findElement(By.xpath("//*[@id='month']"));
		 
		 Select selmonth = new Select(month);
		 
		 selmonth.selectByValue("8");
		 
		 
		WebElement year = driver.findElement(By.xpath("//*[@id='year']"));
		
		Select selyear = new Select(year);
		
		selyear.selectByIndex(6);
		
		Screenshot s = new Screenshot();
		
		s.captureScreenShot(driver, "dropdownscreenshot");
		 
		 
		
		
		
		
		
	}

}
