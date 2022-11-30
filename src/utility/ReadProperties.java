package utility;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class ReadProperties {
	
	
	public static void main(String[] args) throws IOException {
		
		Properties prop = new Properties();
		
		String path = System.getProperty("user.dir")+"//config.properties";
		
		FileInputStream fis = new FileInputStream(path);
		
		prop.load(fis);
		
		
		String value = prop.getProperty("browser");
		
		System.out.println(value);
		
		
		String value2 = prop.getProperty("environment");
		
		System.out.println(value2);
		
	}

}
