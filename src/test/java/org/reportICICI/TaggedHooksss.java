package org.reportICICI;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class TaggedHooksss extends BaseClass {
	@Before(order = 2)
	private void precondition1() {
		windowMaximize();
	}

	@Before(order = 1)
	private void precondition2() {
		launchbrowser();
	}

	@Before(order = 3, value = "@Smoke")
	private void precondition3() {
	System.out.println("Launch");
	}

	@After(order = 3, value = "@Sanity")
	private void postcondition1() {
System.out.println("done");
	}

	@After(order = 2)
	private void postcondition2() {
closeEntireBrowser();
	}

	@After(order = 1)
	private void postcondition3() {
System.out.println("Quit...");
	}
}
