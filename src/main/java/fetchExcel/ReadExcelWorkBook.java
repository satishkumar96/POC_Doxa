package fetchExcel;

import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ReadExcelWorkBook {
	public static XSSFWorkbook getLocatorWorkBook() throws Throwable {
		FileInputStream fis = new FileInputStream("src/main/resources/locators.xlsx");
		XSSFWorkbook wb = new XSSFWorkbook(fis);

		return wb;
	}
}
