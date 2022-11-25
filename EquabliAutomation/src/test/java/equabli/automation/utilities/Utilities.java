package equabli.automation.utilities;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class Utilities {
	private static Select select = null;

	public static void dropdownHandle(String value, WebElement element) {

		select = new Select(element);
		select.selectByVisibleText(value);

	}
	
	
	public void calendarHandle() {
		
		
		
	}

}
