package dropdownhandling;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrintAllElementsOfDropDown {
	
	
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");
		
		WebElement day = driver.findElement(By.xpath("//*[@id='day']"));
		
		
		List<WebElement> allday = driver.findElements(By.xpath("//*[@id='day']//option"));
		
//		for(WebElement dayvalue :allday)
//		{
//			String value = dayvalue.getText();
//			
//			System.out.println(value);
//				
//		}
		
		int numberofvalues = allday.size();
		
		System.out.println(numberofvalues);
		
		
		for(int i=0; i<numberofvalues; i++)
		{
			String textoverelement = allday.get(i).getText();
			
			System.out.println(textoverelement);
		}
		
		
		Select sel = new Select(day);
		
		List<WebElement> value = sel.getOptions();
		
		for(WebElement eachvalue:value)
		{
			String val = eachvalue.getText();
			
			System.out.println(val);
		}
		
		
		
		
		
		
	}

}
