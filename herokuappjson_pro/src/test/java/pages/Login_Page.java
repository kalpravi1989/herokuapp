package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import utils.Seleniumutils;

public class Login_Page extends Seleniumutils {
	WebDriver mydriver;

	public Login_Page(WebDriver driver) {
		this.mydriver=driver;
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath = "//input[@id='username']")
	WebElement usrname;

	@FindBy(xpath = "//input[@id='password']")
	WebElement pwd;

	@FindBy(xpath = "//button[@type='submit']")
	WebElement loginBtn;

	@FindBy(xpath = "//div[contains(text(),' Your username is invalid!')]")
	WebElement userIderror;

	@FindBy(xpath = "//div[contains(text(),' Your password is invalid!')]")
	WebElement passwordError;

	public void login(String usr, String pswd) {
		entertext(usrname, usr);
		entertext(pwd, pswd);
		seleniumclick(loginBtn);

	}

	public WebElement getuserIderror() {
		return userIderror;
	}

	public WebElement getpasswordError() {
		return passwordError;
	}

}
