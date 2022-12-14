package org.redbus;

import org.base.BaseClass;

import cucumber.api.java.After;
import cucumber.api.java.Before;

public class Hooks extends BaseClass {
	@Before(order = 1)
	private void precondition1() {
		launchbrowser();

	}

	@Before(order = 2)
	private void precondition2() {
		windowMaximize();

	}

	@Before(order = 3)
	private void precondition3() {
		System.out.println("tag1");
	}

	@After(order = 1)
	private void postcondition1() {
		System.out.println("done");

	}

	@After(order = 2)
	private void postcondition2() {
		closeEntireBrowser();

	}
}
