package locator;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TypesOfLocator {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.amazon.in/");
		
//		By id locator

		WebElement searchfield = driver.findElement(By.id("twotabsearchtextbox"));

		searchfield.sendKeys("Mobile phone");

		WebElement searchbutton = driver.findElement(By.id("nav-search-submit-button"));

		searchbutton.click();

	}

}
