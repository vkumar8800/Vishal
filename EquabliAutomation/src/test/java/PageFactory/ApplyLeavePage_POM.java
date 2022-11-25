package PageFactory;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.interactions.Actions;

public class ApplyLeavePage_POM {
	WebDriver driver = null;
	private String calMonthName = "";
	private String calYearName = "";
	private String calDateName = "";
	private By applyLeaveLink = By.xpath("//button[@title='Apply Leave']");
	private By leaveType = By.xpath("//div[@class='oxd-select-text oxd-select-text--active']");
	private By leaveTypeVisibleText = By.xpath("//div[contains(text(),'CAN - Bereavement')]");
	private By startDate = By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[2]");
	private By endDate = By.xpath("(//input[contains(@class,'oxd-input oxd-input')])[3]");
	private By textArea = By.xpath("//textarea");
	private By submitButton = By.xpath("//button[@type='submit']");
	private By calendarMonthDrop = By.xpath("//div[@class='oxd-calendar-selector-month-selected']");
	private By calendarMonthName = By.xpath("//li[contains(text(),'" + calMonthName + "')]");
	private By calendarYearDrop = By.xpath("//div[@class='oxd-calendar-selector-year-selected']");
	private By calendarYearName = By.xpath("//li[contains(text(),'" + calYearName + "')]");
	private By calendarDate = By.xpath("//div[contains(text(),'" + calDateName + "')]");

	public ApplyLeavePage_POM(WebDriver driver) {
		this.driver = driver;
	}

	public void clickApplyLeaveLink() {
		driver.findElement(applyLeaveLink).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

	public void leaveType(String leaveTypeDropdown) {
		driver.findElement(leaveType).click();
		Actions action = new Actions(driver);
		action.sendKeys(Keys.ARROW_DOWN).build().perform();
		action.sendKeys(Keys.TAB).build().perform();
		// driver.findElement(leaveTypeVisibleText).click();

	}

	public void startDate(String startDateValue) {

		driver.findElement(startDate).sendKeys(startDateValue);

	}

	public void endDate(String endDateValue) {
		driver.findElement(endDate).sendKeys(endDateValue);

	}

	public void textArea(String textAreaValue) {
		driver.findElement(textArea).sendKeys(textAreaValue);

	}

	public void submitButton() {
		driver.findElement(submitButton).click();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
