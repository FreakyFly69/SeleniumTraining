package testngdiscussion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class AmazonLoginPage {
	WebDriver driver;

	@Test(priority = 1)
	public void loginToApp() {
		driver = new ChromeDriver();

		driver.get("https://www.amazon.in/");

		WebElement hoverelement = driver.findElement(By.xpath("//*[@id='nav-link-accountList']"));

		Actions act = new Actions(driver);

		act.moveToElement(hoverelement).perform();

		WebElement signinbutton = driver
				.findElement(By.xpath("//*[@id='nav-flyout-ya-signin']//*[@class='nav-action-button']"));
		signinbutton.click();
	}

	

}
