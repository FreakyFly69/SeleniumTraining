package utility;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelReader {

	public static void main(String[] args) throws IOException {

		String path = "C:\\Users\\DELL\\Desktop\\KatrajTestData.xlsx";

		File src = new File(path);

//		to load the excel sheet we are using fileinputstream class

		FileInputStream fis = new FileInputStream(src);

		XSSFWorkbook wb = new XSSFWorkbook(fis);

		XSSFSheet sh1 = wb.getSheet("20AugSheet");

//		wb.getSheetAt(0);

//		String value = sh1.getRow(6).getCell(0).getStringCellValue();

//		System.out.println(value);

		DataFormatter df = new DataFormatter();

		String value = df.formatCellValue(sh1.getRow(8).getCell(0));

		System.out.println(value);// 50

	}

}
