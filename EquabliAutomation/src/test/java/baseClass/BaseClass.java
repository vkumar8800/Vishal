package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class BaseClass {

	public WebDriver driver = null;
	String browserName = "chrome";
	String url = "https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";

	public void setUpBrowser() {
		if (browserName.equals("chrome")) {
			System.setProperty("webdriver.chrome.driver", "../EquabliAutomation/Drivers/chromedriver.exe");
			driver = new ChromeDriver();

		}

		else if (browserName.equals("firefox")) {
			System.setProperty("webdriver.gecko.driver", "../EquabliAutomation/Drivers/geckodriver.exe");
			driver = new FirefoxDriver();

		}

		driver.get(url);
		driver.manage().window().maximize();
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

	}

}
