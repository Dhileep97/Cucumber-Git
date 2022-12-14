package org.pojo;

import org.base.BaseClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Fbpart1 extends BaseClass {
	public Fbpart1() {
		PageFactory.initElements(driver, this);
	}

	@FindAll({ @FindBy(xpath = "//input[@id='email']"), @FindBy(xpath = "//input[@name='email']"),
			@FindBy(xpath = "//input[@autofocus='1']") })
	private WebElement varRef;
	@FindBy(name="pass")
	private WebElement password;
	@FindBy(name ="login")
	private WebElement login;
	public WebElement getVarRef() {
		return varRef;
	}
	public WebElement getPassword() {
		return password;
	}
	public WebElement getLogin() {
		return login;
	}
}
