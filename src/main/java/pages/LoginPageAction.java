package pages;

import basePage.BasePage;
import fetchLocators.LoginPageLocators;

public class LoginPageAction {
	
	private LoginPageLocators lpl = new LoginPageLocators();
	private BasePage bp = new BasePage();

	public void enterUsername(String username) throws Throwable {
		bp.elementSendKeys(lpl.getUserName(), username);
	}
	public void enterPassword(String password) throws Throwable {
		bp.elementSendKeys(lpl.getPassword(), password);
	}
	public void clickSubmitButton() throws Throwable {
		bp.clickElement(lpl.getSubmitButton());
	}
	public void getErrorMessage() throws Throwable {
		System.out.println(bp.getElementText(lpl.getErrorMessage()));
	}
	public void clickForgotPassword() throws Throwable {
		bp.clickElement(lpl.getForgotPasswordLink());
	}
	public void getForgotPasswordHeaderText() throws Throwable {
		System.out.println(bp.getElementText(lpl.getFogotPasswordHeaderText()));
	}
	public void enterEmailAddress(String emailAddress) throws Throwable {
		bp.elementSendKeys(lpl.getEmailAddress(), emailAddress);
	}
	public void clickResetButton() throws Throwable {
		bp.clickElement(lpl.getResetButton());
	}
	public void getPasswordResetSuccessMessage() throws Throwable {
		System.out.println(bp.getElementText(lpl.getResetPasswordSuccessMessage()));
	}
	public void clickLoginNowButton() throws Throwable {
		bp.clickElement(lpl.getLoginNowButton());
	}
}
