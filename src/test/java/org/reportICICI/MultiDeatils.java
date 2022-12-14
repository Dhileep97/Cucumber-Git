package org.reportICICI;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultiDeatils extends BaseClass {
	@Given("user launch browser and window maximize")
	public void userLaunchBrowserAndWindowMaximize() {
	    launchbrowser();
	    windowMaximize();
	}

	@When("user launch url")
	public void userLaunchUrl() {
		launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=IPRU");
	}

	@When("enter id as {string}in Id field")
	public void enterIdAsInIdField(String UserId) {
		WebElement user = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	    user.sendKeys(UserId);
	}

	@When("enter pass as {string}in password field")
	public void enterPassAsInPasswordField(String Password) {
		WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	    pass.sendKeys(Password);
	}

	@When("user click login")
	public void userClickLogin() {
		WebElement btn = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
	    btn.click();
	}

	@Then("user quit the browser")
	public void userQuitTheBrowser() {
		closeEntireBrowser();
	    
	}

}
