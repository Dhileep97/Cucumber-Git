package org.stepdata;
import io.cucumber.datatable.*;//manually import the data table

import java.util.List;

import org.base.BaseClass;
import org.pojo.SignInPojo;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Fbtable extends BaseClass{
	SignInPojo s;
	@Given("Launch browser and maximize window")
	public void launch_browser_and_maximize_window() {
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
//write datatable in method() 
	@Given("Enter first name in firstname text box")
	public void enter_first_name_in_firstname_text_box(DataTable d) throws InterruptedException {
		Thread.sleep(3000);
		List<String> asList = d.asList();
		s = new SignInPojo();
		 passText(asList.get(0), s.getFirstname());
	}
	@Given("Enter second name in second name text box")
	public void enter_second_name_in_second_name_text_box(DataTable a) {
		List<String> ad = a.asList();
		 s = new SignInPojo();
		 passText(ad.get(0), s.getLastname());
	}
	@Given("Enter mobile no or email in email text box")
	public void enter_mobile_no_or_email_in_email_text_box(DataTable e) {
		List<List<String>> asLists = e.asLists();
		 s = new SignInPojo();
		 passText(asLists.get(0).get(1), s.getEmailormobile());
	}

	@Given("Enter new password in new password field")
	public void enter_new_password_in_new_password_field() {
		 s = new SignInPojo();
	    passText("ThunderBolt@123", s.getNewPassword());
	}

	@Then("Close the browser")
	public void close_the_browser() {
	  // closeEntireBrowser();
		System.out.println("Success");
	    
	}
}
