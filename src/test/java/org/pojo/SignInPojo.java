package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SignInPojo extends BaseClass{

	public SignInPojo() {
		PageFactory.initElements(driver, this);
	}
	@FindBy(xpath = "//a[text()='Create New Account']")
	private WebElement createNewAccount;
	@FindBy(name = "firstname")
	private WebElement firstname;
	@FindBy(name = "lastname")
	private WebElement lastname;
	@FindBy(name = "reg_email__")
	private WebElement emailormobile;
	@FindBy(id = "password_step_input")
	private WebElement newPassword;
	public WebElement getCreateNewAccount() {
		return createNewAccount;
	}
	public WebElement getFirstname() {
		return firstname;
	}
	public WebElement getLastname() {
		return lastname;
	}
	public WebElement getEmailormobile() {
		return emailormobile;
	}
	public WebElement getNewPassword() {
		return newPassword;
	}
}
