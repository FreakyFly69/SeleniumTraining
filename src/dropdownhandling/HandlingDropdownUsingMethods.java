package dropdownhandling;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandlingDropdownUsingMethods {

	
	
	public static void selectValueDropdown(WebElement ele, String value)
	{
		Select selday = new Select(ele);
		
		selday.selectByVisibleText(value);
		
	}
	
	
public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		selectValueDropdown(day, "6");
		
}
	
	
	
}
