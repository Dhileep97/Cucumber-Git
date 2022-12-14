package org.hooks;

import org.base.BaseClass;
import org.pojo.Fbpart1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MultipleFb extends BaseClass{

	Fbpart1 f;
	@Given("launch browser and window maximize")
	public void launch_browser_and_window_maximize() {
		launchbrowser();
		windowMaximize();
	}

	@When("launch URl")
	public void launch_URl() {
		launchUrl("https://www.facebook.com/");
	}
	
	@When("Enter the data {string} in email field")
	public void enter_the_data_in_email_field(String mail) {
	f = new Fbpart1();
	passText(mail, f.getVarRef());
	}

	@When("Enter the data {string} in password field")
	public void enter_the_data_in_password_field(String pass) {
		f= new Fbpart1();
		passText(pass, f.getPassword());
	}

	@When("Click login button")
	public void click_login_button() {
		f = new Fbpart1();
		clickBtn(f.getLogin());
	}

	@Then("close the browser")
	public void close_the_browser() {
		closeEntireBrowser();
		System.out.println("quit the browser");
	}
}
