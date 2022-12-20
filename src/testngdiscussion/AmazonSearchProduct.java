package testngdiscussion;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class AmazonSearchProduct extends AmazonLoginPage{
	
	
	@Test(priority = 2)
	public void searchProduct() {
		driver.findElement(By.xpath("//*[@id='ap_email']")).sendKeys("abc@gmail.com");
	
	
	
	}

}
