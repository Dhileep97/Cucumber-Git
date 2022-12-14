package org.stepFlipkart;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Flipkart extends BaseClass {
	@Given("User to launch the browser")
	public void user_to_launch_the_browser() {
		System.out.println("Check Loginpage");
		launchbrowser();
		windowMaximize();
	}

	@When("User to launch Url")
	public void user_to_launch_Url() {
		launchUrl("https://www.flipkart.com/");
	}

	@When("User enter the username")
	public void user_enter_the_username() {
		WebElement user = driver.findElement(By.xpath("//input[@class='_2IX_2- VJZDxU']"));
		user.sendKeys("9942088931");
	}

	@When("User enter the password")
	public void user_enter_the_password() {
		WebElement pass = driver.findElement(By.xpath("//input[@class='_2IX_2- _3mctLh VJZDxU']"));
		pass.sendKeys("Flip@1997");
	}

	@When("click the login button")
	public void click_the_login_button() {
		WebElement btn = driver.findElement(By.xpath("//button[@class='_2KpZ6l _2HKlqd _3AWRsL']"));
		btn.click();
	}

	@Then("close the browser")
	public void close_the_browser() {
		System.out.println("Login Success");
		closeEntireBrowser();
	}
}
