package fetchExcel;

import org.apache.poi.xssf.usermodel.XSSFSheet;

public class ReadExcelSheet {
	public XSSFSheet getLoginPageSheet() throws Throwable {
		XSSFSheet LoginPageSheet = ReadExcelWorkBook.getLocatorWorkBook().getSheet("LoginPage");
		return LoginPageSheet;
	}
}
