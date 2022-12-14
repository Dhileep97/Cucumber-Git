package org.tagBasicMyntra;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class BasicMyntra extends BaseClass {
	@Given("Launch browser and maximize window")
	public void launchBrowserAndMaximizeWindow() {
		launchbrowser();
		windowMaximize();
	}

	@When("Launch url")
	public void launchUrl() {
		launchUrl("https://www.myntra.com/");
	}

	@When("Mouse over to profile")
	public void mouseOverToProfile() {
		Actions actions = new Actions(driver);
		WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
		actions.doubleClick(profile).perform();
	}

	@When("Click login button")
	public void clickLoginButton() throws AWTException {
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("Enter Mobile no")
	public void enterMobileNo() throws InterruptedException {
		Thread.sleep(3000);
		WebElement mobile = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
		mobile.sendKeys("9874563210");
	}

	@When("Click continue button")
	public void clickContinueButton() {
		WebElement c = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
		c.click();
	}

	@Then("Quit the browser")
	public void quitTheBrowser() {
		closeEntireBrowser();
	}

}
