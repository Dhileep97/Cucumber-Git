package org.TagBasicFbLogin;

import org.base.BaseClass;
import org.pojo.SignInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Createacc extends BaseClass{
	SignInPojo s;
	@Given("Launch the browser and maximize window")
	public void launch_the_browser_and_maximize_window() {
	   launchbrowser();
	   windowMaximize();
	}

	@Given("Launch url")
	public void launch_url() {
	   launchUrl("https://www.facebook.com/");
	}

	@Given("Click create new account button")
	public void click_create_new_account_button() {
	   s = new SignInPojo();
	   clickBtn(s.getCreateNewAccount());
	}

	@Given("Enter first name in firstname text box")
	public void enter_first_name_in_firstname_text_box() throws InterruptedException {
		Thread.sleep(3000);
		s = new SignInPojo();
		 passText("Dhileep", s.getFirstname());
	}

	@Given("Enter second name in second name text box")
	public void enter_second_name_in_second_name_text_box() {
		 s = new SignInPojo();
		 passText("kumar", s.getLastname());
	}

	@Given("Enter mobile no or email in email text box")
	public void enter_mobile_no_or_email_in_email_text_box() {
		 s = new SignInPojo();
		 passText("dhileep@gmail.com", s.getEmailormobile());
	}

	@Given("Enter new password in new password field")
	public void enter_new_password_in_new_password_field() {
		 s = new SignInPojo();
	    passText("ThunderBolt@123", s.getNewPassword());
	}

	@Then("Close the browser")
	public void close_the_browser() {
	  closeEntireBrowser();
		System.out.println("Success");
	    
	}
}
