package Steps;

import Hooks.environment;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import pages.LoginPageAction;

public class LoginPageSteps {
	
	private LoginPageAction lpa = new LoginPageAction();
	
	@Given("login page open properly")
	public void login_page_open_properly() {
	}

	@Then("fetch login page title")
	public void fetch_login_page_title() {
		System.out.println(environment.driver.getTitle());
	}

	@Given("enter email id as {string}")
	public void enter_email_id_as(String un) throws Throwable {
		lpa.enterUsername(un);
	}

	@Given("enter password as {string}")
	public void enter_password_as(String pwd) throws Throwable {
		lpa.enterPassword(pwd);
	}

	@When("click on submit button")
	public void click_on_submit_button() throws Throwable {
		lpa.clickSubmitButton();
	}

	@Then("fetch error message")
	public void fetch_error_message() throws Throwable {
		lpa.getErrorMessage();
	}
	@Given("click on forgot password link")
	public void click_on_forgot_password_link() throws Throwable {
		lpa.clickForgotPassword();
	}

	@When("forgot password page display")
	public void forgot_password_page_display() {
	}

	@When("fetch current page title")
	public void fetch_current_page_title() {
		System.out.println(environment.driver.getTitle());
	}

	@When("fetch the instruction text")
	public void fetch_the_instruction_text() throws Throwable {
		lpa.getForgotPasswordHeaderText();
	}

	@Then("enter email address as {string}")
	public void enter_email_address_as(String emailAddress) throws Throwable {
		lpa.enterEmailAddress(emailAddress);
	}

	@Then("click on reset button")
	public void click_on_reset_button() throws Throwable {
		lpa.clickResetButton();
	}

	@Then("fetch success message appear on the screen")
	public void fetch_success_message_appear_on_the_screen() throws Throwable {
		lpa.getPasswordResetSuccessMessage();
	}

	@Then("click on Login Now button")
	public void click_on_login_now_button() throws Throwable {
		lpa.clickLoginNowButton();
	}
}
