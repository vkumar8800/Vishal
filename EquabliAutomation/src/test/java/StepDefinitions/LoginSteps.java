package StepDefinitions;

import java.io.IOException;

import PageFactory.LoginPage_POM;
import baseClass.BaseClass;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginSteps extends BaseClass {

	String filePaths = "";
	LoginPage_POM loginPage = null;

	@Given("Browser is Launched")
	public void browser_is_launched() throws InterruptedException {

		setUpBrowser();
		Thread.sleep(3000);

	}

	@When("^Enter (.*) and (.*)$")
	public void enter_username_and_password(String username, String password) throws InterruptedException, IOException {

		loginPage = new LoginPage_POM(driver);
		loginPage.enterUsername(username);
		loginPage.enterPassword(password);

	}

	@And("Click on Login button")
	public void click_on_login_button() throws InterruptedException, IOException {

		loginPage.clickLoginButton();
		Thread.sleep(3000);
	}

	@Then("Home Page is shown")
	public void home_page_is_shown() throws IOException {

//		homeText = driver.findElement(By.xpath(FileReaders.readFile(filePaths, "homePage_Text")));
//		String homeTextValue = homeText.getText();
//		Assert.assertEquals("Dashboard", homeTextValue);
//		System.out.println("Home Page is opened: " + homeTextValue);
		//driver.quit();
	}

}
