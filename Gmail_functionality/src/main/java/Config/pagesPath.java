package Config;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class pagesPath {

	WebElement Project;

	public pagesPath(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "*//input[@id = 'identifierId']")
	WebElement username;

	public WebElement getUsername() {
		return username;
	}

	@FindBy(xpath = "*//input[@name = 'password']")
	WebElement password;

	public WebElement getPassword() {
		return password;
	}

	@FindBy(xpath = "*//div[contains(text(),'Compose')]")
	WebElement composeButton;

	public WebElement getComposeButton() {
		return composeButton;
	}

	@FindBy(xpath = "*//div[contains(text(),'New Message')]")
	WebElement NewMessage;

	public WebElement getNewMessage() {
		return NewMessage;
	}

	@FindBy(xpath = "//textarea[@id=':ov']")
	WebElement recipient;

	public WebElement getRecipient() {
		return recipient;
	}

	@FindBy(xpath = "//input[@id=':od']")
	WebElement subject;

	public WebElement getSubject() {
		return subject;
	}

	@FindBy(xpath = "//div[@id=':pp']")
	WebElement body;

	public WebElement getBody() {
		return body;
	}

	@FindBy(xpath = "//div[@id=':pt']")
	WebElement attachment;

	public WebElement getAttachment() {
		return attachment;
	}

	@FindBy(xpath = "//div[@id=':o3']")
	WebElement sendButton;

	public WebElement getSendButton() {
		return sendButton;
	}

}
