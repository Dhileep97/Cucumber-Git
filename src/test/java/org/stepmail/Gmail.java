package org.stepmail;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Gmail extends BaseClass {
	@Given("User navigate to the gmail login page")
	public void user_navigate_to_the_gmail_login_page() {
		System.out.println("Gmail login check");
	   launchbrowser();
	   windowMaximize();
	   launchUrl("https://accounts.google.com/");
	}
	@When("User enter the username as {string} in email field")
	public void user_enter_the_username_as_in_email_field(String mailId) {
	    WebElement id = driver.findElement(By.id("identifierId"));
	    id.sendKeys(mailId);
	}

	@When("User click next button")
	public void user_click_next_button()  {
		WebElement bn = driver.findElement(By.xpath("//span[text()='Next']"));
	    bn.click();
	}
	
	@Then("User quit the browser")
	public void user_quit_the_browser() {
		System.out.println("passed");
	    closeEntireBrowser();
	}


}
	