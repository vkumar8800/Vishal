package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import baseClass.BaseClass;

public class LoginPage_POM{
	WebDriver driver = null;
	private By txt_username = By.xpath("//input[@name='username']");
	private By txt_password = By.xpath("//input[@name='password']");
	private By login_button = By.xpath("//button[contains(text(),'')]");

	public LoginPage_POM(WebDriver driver) {
		this.driver = driver;

	}

	public void enterUsername(String username) {
		driver.findElement(txt_username).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElement(txt_password).sendKeys(password);

	}

	public void clickLoginButton() {
		driver.findElement(login_button).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
