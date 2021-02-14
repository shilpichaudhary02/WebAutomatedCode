package Config;

import org.openqa.selenium.chrome.ChromeDriver;

public class Utilities {
	public ChromeDriver driverBase() {
		System.setProperty("webdriver.chrome.driver",
				"D:/Practice_Selenium/Compose_Gmail_Project/workspace/Gmail_functionality/Driver/chromedriver.exe");
		ChromeDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get(
				"https://accounts.google.com/ServiceLogin/identifier?passive=1209600&continue=https%3A%2F%2Faccounts.google.com%2F&followup=https%3A%2F%2Faccounts.google.com%2F&flowName=GlifWebSignIn&flowEntry=ServiceLogin");

		return driver;
	}

}
