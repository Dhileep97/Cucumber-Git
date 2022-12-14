package org.TagBasicFbLogin;

import org.base.BaseClass;
import org.pojo.Fbpart1;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Fbbaasic extends BaseClass{
		Fbpart1 f;
		@Given("Launch browser and maximize window")
		public void launch_browser_and_maximize_window() {
		    launchbrowser();
		    windowMaximize();
		}

		@When("Launch fb url")
		public void launch_fb_url() {
			launchUrl("https://www.facebook.com/");
		}

		@When("Enter valid username in email field")
		public void enter_valid_username_in_email_field() {
			f = new Fbpart1();
			passText("dhileep@gmail.com", f.getVarRef());
		   
		}

		@When("Enter Invalid password in password field")
		public void enter_Invalid_password_in_password_field() {
			f= new Fbpart1();
			passText("Twwwt@18", f.getPassword());
		   
		}

		@When("Click the login button")
		public void click_the_login_button() {
			f = new Fbpart1();
			clickBtn(f.getLogin());
		   
		}

		@Then("Quit the browser")
		public void quit_the_browser() {
			closeEntireBrowser();
		   
		}

		
		
		



	}



