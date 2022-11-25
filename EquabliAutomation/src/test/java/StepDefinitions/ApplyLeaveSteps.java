package StepDefinitions;

import PageFactory.ApplyLeavePage_POM;
import PageFactory.LoginPage_POM;
import baseClass.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ApplyLeaveSteps extends BaseClass {
	LoginPage_POM loginPage = null;
	ApplyLeavePage_POM applyLeave = null;

	@Given("^Login Application (.*) and (.*)$")
	public void login_application(String username, String password) {
		setUpBrowser();
		loginPage = new LoginPage_POM(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);
		loginPage.clickLoginButton();

	}

	@When("Click on AssignLeave link")
	public void click_on_assign_leave_link() {
		applyLeave = new ApplyLeavePage_POM(driver);
		applyLeave.clickApplyLeaveLink();

	}

	@When("^Fill applyLeave form (.*), (.*), (.*), (.*)$")
	public void fill_apply_leave_form(String leaveTypeValue, String startDateValue, String endDateValue, String textAreaValue) {
		applyLeave.leaveType(leaveTypeValue);
		applyLeave.startDate(startDateValue);
		applyLeave.endDate(endDateValue);
		applyLeave.textArea(textAreaValue);
	}

	@Then("Click on Submit button")
	public void click_on_submit_button() {
		applyLeave.submitButton();

	}

	@Then("Confirm the form submittion")
	public void confirm_the_form_submittion() {

	}

}
