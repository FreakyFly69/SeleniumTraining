package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Test2 {
	
	
	public static void main(String[] args) throws IOException {
		
		String path = "C:\\Users\\DELL\\Desktop\\KatrajMorning.xlsx";

		File src = new File(path);

//		to load the excel sheet we are using fileinputstream class

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("Sheet1");

		DataFormatter df = new DataFormatter();

		int numberofrowsinsheet = sh1.getLastRowNum();

		System.out.println("Total number of rows are :" + numberofrowsinsheet);

		int numberofcolumn = sh1.getRow(0).getLastCellNum();

		System.out.println("Total number of columns are :" + numberofcolumn);
		
		int rowcount = numberofrowsinsheet+1;
		
		
		for(int i=0; i<rowcount; i++)
		{
			for(int j=0; j<numberofcolumn; j++)
			{
				String value = df.formatCellValue(sh1.getRow(i).getCell(j));
				System.out.print(value+" ");
			}
			
			System.out.println();
		}
		
		
	}

}
