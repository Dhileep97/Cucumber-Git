package org.taks;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.base.BaseClass;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdef extends BaseClass{
	@Given("User launch browser and maximize window")
	public void userLaunchBrowserAndMaximizeWindow() {
		launchbrowser();
		windowMaximize();
	}
	@When("User launch url")
	public void userLaunchUrl() {
		launchUrl("https://www.myntra.com/");
	}
	@When("mouse over to men")
	public void mouseOverToMen() {
		Actions actions = new Actions(driver);
		WebElement men = driver.findElement(By.xpath("(//a[text()='Men'])[1]"));
		actions.moveToElement(men).perform();
	}
	@When("User click tshirt option")
	public void userClickTshirtOption() throws AWTException, InterruptedException {
		Thread.sleep(4000);
		Robot robot = new Robot();
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_TAB);
		robot.keyRelease(KeyEvent.VK_TAB);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
	    
	}
	@When("User click first product and select m size")
	public void userClickFirstProductAndSelectMSize() throws InterruptedException {
		Thread.sleep(2000);
	   WebElement tshirt = driver.findElement(By.xpath("(//div[@class='product-productMetaInfo'])[1]"));
	    tshirt.click();
	    String parent = driver.getWindowHandle();
	    System.out.println(parent);
	    Set<String> child = driver.getWindowHandles();
	    System.out.println(child);
	    for (String id : child) {
			if (id!=parent) {
				driver.switchTo().window(id);
			}
		}
	    Thread.sleep(3000);
	    JavascriptExecutor js = (JavascriptExecutor)driver;
		WebElement mens = driver.findElement(By.xpath("(//p[@class='size-buttons-unified-size'])[2]"));
		js.executeScript("arguments[0].click()",mens);
		WebElement bag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
		bag.click();
		closeCurrentBrowser();
		driver.switchTo().window(parent);
	}

/*	@When("user click add to bag button")
	public void userClickAddToBagButton() {
	   WebElement bag = driver.findElement(By.xpath("//div[text()='ADD TO BAG']"));
	   bag.click();
	   
	}

	@When("user close current tab")
	public void userCloseCurrentTab() {
		//closeCurrentBrowser();
	    
	}*/

	@When("user click bag icon")
	public void userClickBagIcon() throws InterruptedException {
		//driver.navigate().to("");
		Thread.sleep(3000);
	
WebElement bagg = driver.findElement(By.xpath("//span[text()='Bag']"));
bagg.click();
	}

	@When("user take screenshot")
	public void userTakeScreenshot() throws InterruptedException, IOException {
		Thread.sleep(3000);
		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\admin\\eclipse-workspace\\Cucumber\\image\\myntra.png");
		FileUtils.copyFile(s, d);
	}

	@Then("User quit browser")
	public void userQuitBrowser() {
		System.out.println("done");
	   closeEntireBrowser();
	    
	}



}
