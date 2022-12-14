package org.reportICICI;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicICICI extends BaseClass{
	@Given("launch browser and window maximize")
	public void launchBrowserAndWindowMaximize() {
	    launchbrowser();
	    windowMaximize();
	    
	}

	@When("Launch url")
	public void launchUrl() {
	    launchUrl("https://infinity.icicibank.com/corp/AuthenticationController?FORMSGROUP_ID__=AuthenticationFG&__START_TRAN_FLAG__=Y&FG_BUTTONS__=LOAD&ACTION.LOAD=Y&AuthenticationFG.LOGIN_FLAG=1&BANK_ID=ICI&CTA_FLAG=IPRU");
	    
	}

	@When("Enter Valid user Id")
	public void enterValidUserId() {
	    WebElement user = driver.findElement(By.name("AuthenticationFG.USER_PRINCIPAL"));
	    user.sendKeys("JackSparrow");
	    
	}

	@When("Enter Invalid password")
	public void enterInvalidPassword() {
	    WebElement pass = driver.findElement(By.id("AuthenticationFG.ACCESS_CODE"));
	    pass.sendKeys("BlackPearl");
	    
	}

	@When("Click login")
	public void clickLogin() {
	    WebElement btn = driver.findElement(By.name("Action.VALIDATE_CREDENTIALS"));
	    btn.click();
	    
	}

	@Then("quit browser")
	public void quitBrowser() {
	    closeEntireBrowser();
	}


}
