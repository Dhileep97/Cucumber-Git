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

public class MultiMyntra extends BaseClass {
	@Given("launch browser and window maximizze")
	public void launchBrowserAndWindowMaximizze() {
	    launchbrowser();
	    windowMaximize();
	    
	}

	@When("launch the url")
	public void launchTheUrl() {
	    launchUrl("https://www.myntra.com/");
	}

	@When("mouseover to the profile")
	public void mouseoverToTheProfile() {
		Actions actions = new Actions(driver);
		WebElement profile = driver.findElement(By.xpath("//span[text()='Profile']"));
		actions.doubleClick(profile).perform();
	}

	@When("click signup button")
	public void clickSignupButton() throws AWTException {
		Robot robot = new Robot();
	    robot.keyPress(KeyEvent.VK_TAB);
	    robot.keyRelease(KeyEvent.VK_TAB);
	    robot.keyPress(KeyEvent.VK_ENTER);
	    robot.keyRelease(KeyEvent.VK_ENTER);
	}

	@When("enter valid and invalid details as {string}in email field")
	public void enterValidAndInvalidDetailsAsInEmailField(String phno) throws InterruptedException {
		Thread.sleep(3000);
	    WebElement mobile = driver.findElement(By.xpath("//input[@autocomplete='new-password']"));
	    mobile.sendKeys(phno);  
	}

	@When("click continue")
	public void clickContinue() {
		WebElement c = driver.findElement(By.xpath("//div[text()='CONTINUE']"));
	    c.click();
	}

	@Then("close browser")
	public void closeBrowser() {
	    closeEntireBrowser();
	}


}
