package StepDefinition;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.Keys;
import org.openqa.selenium.chrome.ChromeDriver;
import Config.Utilities;
import Config.pagesPath;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;

public class compose_functionality {

	Utilities utility = new Utilities();
	public ChromeDriver drive;
	public pagesPath path;

	@Given("^Browser opens and enter the url$")
	public void browser_opens_and_enter_the_url() throws Throwable {
		drive = utility.driverBase();
		path = new pagesPath(drive);
	}

	@When("^User should be able to login with gmail account \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_should_be_able_to_login_with_gmail_account_and(String emailAddress, String password)
			throws Throwable {
		Thread.sleep(5000);
		path.getUsername().click();
		Thread.sleep(5000);
		path.getUsername().sendKeys(emailAddress);
		Thread.sleep(5000);
		path.getUsername().sendKeys(Keys.ENTER);
		Thread.sleep(5000);
		path.getPassword().sendKeys(password);
		Thread.sleep(5000);
		path.getPassword().sendKeys(Keys.ENTER);
	}

	@When("^Home page should open$")
	public void home_page_should_open() throws Throwable {
		drive.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
		String ActualMessage = drive.getCurrentUrl();
		Assert.assertEquals("https://mail.google.com/mail/u/0/#inbox", ActualMessage);
	}

	@Then("^verify the compose button on the left side$")
	public void verify_the_compose_button_on_the_left_side() throws Throwable {
		Thread.sleep(2000);
		String ActualText = path.getComposeButton().getText();
		Assert.assertEquals("Compose", ActualText);
	}

	@Given("^Click on the Compose button and NewMessage box opens$")
	public void click_on_the_Compose_button_and_NewMessage_box_opens() throws Throwable {
		Thread.sleep(2000);
		path.getComposeButton().click();
	}

//	@Then("^Verify the \"([^\"]*)\" text$")
//	public void verify_the_text(String ExpectedMessage) throws Throwable {
//		Thread.sleep(2000);
//		String ActualText = path.getNewMessage().getText();
//		Assert.assertEquals(ExpectedMessage, ActualText);
//	}

	@Given("^Enter the values and attach the file$")
	public void enter_the_values_and_attach_the_file() throws Throwable {
		path.getRecipient().sendKeys("abc@yopmail.com");
		path.getSubject().sendKeys("Photo");
		path.getBody().sendKeys("Hello , please find the attached photo");
		path.getAttachment().sendKeys(System.getProperty("user.dir") + "\\Document\\" + "AttachImage.jpg");
		Thread.sleep(5000);
	}

	@Then("^click on send button$")
	public void click_on_send_button() throws Throwable {
		path.getSendButton().click();
	}
}
