package org.hooks;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass{
	//import @before cucumber.api.java
	@Before
	private void precondition() {
			launchbrowser();
			windowMaximize();
	}
	@After
	private void postcondition() {
		closeEntireBrowser();
	}

}
