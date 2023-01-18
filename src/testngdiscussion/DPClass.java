package testngdiscussion;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.DataProvider;

public class DPClass {
	
	@DataProvider(name ="testdata")
	public static String[][]  getData() throws IOException
	{
		String path = "C:\\Users\\DELL\\Desktop\\DPTestdata.xlsx";

		File src = new File(path);

//	to load the excel sheet we are using fileinputstream class

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheetAt(0);
		
		int row = sh1.getLastRowNum() +1;
		
		System.out.println("number of rows are "+row);
		
	int	column = sh1.getRow(0).getLastCellNum();
		
	System.out.println("number of columns are "+column);
	
	String [][] data = new String[row][column];
		
	for(int i=0; i<row; i++ )
	{
		for(int j=0; j<column; j++)
		{
		data[i][j]	= sh1.getRow(i).getCell(j).getStringCellValue();
		}
	}
	
	return data;
		
	}
	
	public static void main(String[] args) throws IOException {
		getData();
	}
	
	
	

}
