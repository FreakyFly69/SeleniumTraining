package basiccommands;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import utility.ExcelReader;

public class GetDataFromExcelSheet {

	public static void main(String[] args) throws IOException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.facebook.com/signup");

		WebElement firstname = driver.findElement(By.xpath("//*[@name='firstname']"));

		ExcelReader er = new ExcelReader();

		String value = er.readData(3, 0);

		firstname.sendKeys(value);

		WebElement lastname = driver.findElement(By.xpath("//*[@name='lastname']"));

		lastname.sendKeys(er.readData(3, 0));

	}

}
