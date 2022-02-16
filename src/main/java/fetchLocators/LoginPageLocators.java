package fetchLocators;

import fetchExcel.ReadExcelCellValue;

public class LoginPageLocators {

	private ReadExcelCellValue rcv = new ReadExcelCellValue();
	
	public String getUserName() throws Throwable {
		return rcv.LoginPageCellValue(1, 1);
	}
	public String getPassword() throws Throwable {
		return rcv.LoginPageCellValue(2, 1);
	}
	public String getSubmitButton() throws Throwable {
		return rcv.LoginPageCellValue(3, 1);
	}
	
	public String getErrorMessage() throws Throwable {
		return rcv.LoginPageCellValue(4, 1);
	}
	public String getForgotPasswordLink() throws Throwable {
		return rcv.LoginPageCellValue(5, 1);
	}
	public String getEmailAddress() throws Throwable {
		return rcv.LoginPageCellValue(6, 1);
	}
	public String getResetButton() throws Throwable {
		return rcv.LoginPageCellValue(7, 1);
	}
	public String getFogotPasswordHeaderText() throws Throwable {
		return rcv.LoginPageCellValue(8, 1);
	}
	public String getLoginNowButton() throws Throwable {
		return rcv.LoginPageCellValue(9, 1);
	}
	public String getResetPasswordSuccessMessage() throws Throwable {
		return rcv.LoginPageCellValue(10, 1);
	}
	public String getDoxaConnexLink() throws Throwable {
		return rcv.LoginPageCellValue(11, 1);
	}
}
