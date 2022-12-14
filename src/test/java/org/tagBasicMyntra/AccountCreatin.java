package org.tagBasicMyntra;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class AccountCreatin extends BaseClass {
	@Given("User launch browser and maximize window")
	public void userLaunchBrowserAndMaximizeWindow() {
		launchbrowser();
		windowMaximize();

	}

	@When("User launch url")
	public void userLaunchUrl() {
		launchUrl("https://www.myntra.com/login/passwordverify");

	}

	@When("User click create new accout button")
	public void userClickCreateNewAccoutButton() {
		WebElement cna = driver.findElement(By.xpath("//div[text()='CREATE NEW ACCOUNT']"));
		cna.click();
	}

	@When("User enter mobile number")
	public void userEnterMobileNumber() throws InterruptedException {
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		mobile.sendKeys("9874563210");

	}

	@When("User click continue")
	public void userClickContinue() {
		WebElement c = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		c.click();

	}

	@Then("User quit browser")
	public void userQuitBrowser() {
		closeEntireBrowser();

	}

}
