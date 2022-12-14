package org.datamap;

import java.util.List;
import java.util.Map;

import org.base.BaseClass;
import org.pojo.SignInPojo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import io.cucumber.datatable.DataTable;

public class MapTable extends BaseClass{
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
	//write String,String					//write String.class
		Map<String, String> asMap = d.asMap(String.class, String.class);
		s = new SignInPojo();
		 passText(asMap.get("name4"), s.getFirstname());
	}
	@Given("Enter second name in second name text box")
	public void enter_second_name_in_second_name_text_box(DataTable a) {
		Map<String, String> as = a.asMap(String.class, String.class);
		s = new SignInPojo();
		 passText(as.get("name4"), s.getLastname());
	}
	@Given("Enter mobile no or email in email text box")
	public void enter_mobile_no_or_email_in_email_text_box(DataTable e) {
		List<Map<String,String>> asMaps = e.asMaps();
		 s = new SignInPojo();
		 passText(asMaps.get(2).get("mail1"), s.getEmailormobile());
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
