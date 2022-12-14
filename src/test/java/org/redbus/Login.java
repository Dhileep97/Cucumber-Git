package org.redbus;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Login extends BaseClass {
	@Given("Launch browser and maximize window")
	public void launchBrowserAndMaximizeWindow() {
	    launchbrowser();
	    windowMaximize();
	}

	@When("launch url")
	public void launchUrl() {
	    launchUrl("https://www.redbus.in/");
	}

	@When("click profile icon")
	public void clickProfileIcon() {
	  WebElement profile = driver.findElement(By.id("i-icon-profile"));
	  profile.click();
	}

	@When("click signup button")
	public void clickSignupButton() {
	    WebElement sign = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
	    sign.click();
	}

	@When("enter mobile number")
	public void enterMobileNumber() throws InterruptedException {
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement no = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		no.sendKeys("7598462015");
	}

	@Then("quit browser")
	public void quitBrowser() {
	    closeEntireBrowser();
	}

	@Given("launch browser and window maximize")
	public void launchBrowserAndWindowMaximize() {
	  launchbrowser();
	  windowMaximize();
	}

	@When("Launch redbus url")
	public void launchRedbusUrl() {
	    launchUrl("https://www.redbus.in/");
	}

	@When("Click profile ico")
	public void clickProfileIco() {
		WebElement profile = driver.findElement(By.id("i-icon-profile"));
		  profile.click();
	}

	@When("Click signupbutton")
	public void clickSignupbutton() {
		 WebElement sign = driver.findElement(By.xpath("//li[text()='Sign In/Sign Up']"));
		    sign.click();
	}

	@When("Enter mobile number as{string}in mobile number field")
	public void enterMobileNumberAsInMobileNumberField(String phone) throws InterruptedException {
		Thread.sleep(3000);
		WebElement frame = driver.findElement(By.xpath("//iframe[@class='modalIframe']"));
		driver.switchTo().frame(frame);
		WebElement no = driver.findElement(By.xpath("//input[@id='mobileNoInp']"));
		no.sendKeys(phone);
	}

	@Then("Quit the browser")
	public void quitTheBrowser() {
		closeEntireBrowser();
	}
	

}
