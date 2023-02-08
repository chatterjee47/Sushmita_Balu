package PageObjectory;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BaseClass.BrowserSetup;

public class LoginPage extends BrowserSetup {

	public LoginPage(WebDriver driver) {
		BrowserSetup.driver = driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(name = "username")
	private WebElement UserName;

	@FindBy(name = "password")
	private WebElement Password;

	@FindBy(xpath = "//*[@type='submit']")
	private WebElement LoginBtn;

	public void UserName(String value) {
		UserName.sendKeys(value);
	}

	public void Password(String value) {
		Password.sendKeys(value);
	}

	public void LoginBtn() {
		LoginBtn.click();
	}

}
