package basiccommands;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SomeMethods {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement radiobutton = driver.findElement(By.xpath("//*[contains(@id,'u_0_5_')]"));

		boolean isradioenable = radiobutton.isEnabled();

		System.out.println(isradioenable);// true

		boolean isradioselected = radiobutton.isSelected();

		System.out.println(isradioselected);// false

		radiobutton.click();

		boolean isradioselected2 = radiobutton.isSelected();

		System.out.println(isradioselected2);// true

		boolean isradiodisplaying = radiobutton.isDisplayed();

		System.out.println(isradiodisplaying);// true

	}

}
