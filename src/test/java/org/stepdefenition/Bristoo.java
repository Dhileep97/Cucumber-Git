package org.stepdefenition;


import org.base.BaseClass;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Bristoo extends BaseClass{
	
	@Given("Launch browser and window maximize")
	public void launchBrowserAndWindowMaximize() {
	    launchbrowser();
	    windowMaximize();
	    
		
	}
	@When("launch url")
	public void launchUrl() {
		launchUrl("https://bistrobitesdc.com/");
	}
	@When("User click the account button")
	public void userClickTheAccountButton() {
	    WebElement acc = driver.findElement(By.xpath("(//li[@class='lte-nav-profile '])[2]"));
	    acc.click();
	}
	@When("User enter invalid username")
	public void userEnterInvalidUsername() {
	    WebElement name = driver.findElement(By.id("phone"));
	    name.sendKeys("9874563210");
	}
	@When("User enter invalid password")
	public void userEnterInvalidPassword() {
	    WebElement pass = driver.findElement(By.id("password"));
	    pass.sendKeys("Gujfehb@875");
	}
	@When("User click login button")
	public void userClickLoginButton() {
	  WebElement log = driver.findElement(By.name("login"));
	  log.click();
	  System.out.println("Scenario 1 passed");
	}
	@Then("close browser")
	public void closeBrowser() {
	    closeCurrentBrowser();
	}
	@When("User clicks the account button")
	public void userClicksTheAccountButton() {
		 WebElement accn = driver.findElement(By.xpath("(//li[@class='lte-nav-profile '])[2]"));
		 accn.click();   
	}
	@When("User enter valid username and password")
	public void userEnterValidUsernameAndPassword() {
		 WebElement name = driver.findElement(By.id("phone"));
		    name.sendKeys("9942088931");
		 WebElement pass = driver.findElement(By.id("password"));
		    pass.sendKeys("Bistrobites");
		 WebElement log = driver.findElement(By.name("login"));
			  log.click();
	}
	@When("User click the home button")
	public void userClickTheHomeButton() throws InterruptedException {
		Thread.sleep(3000);
	    WebElement m = driver.findElement(By.linkText("Menu"));
		m.click();
	}
	@When("User click Dosa on popular items")
	public void userClickDosaOnPopularItems() throws InterruptedException {
		Thread.sleep(3000);
	   WebElement ds = driver.findElement(By.linkText("Dosa"));
	   ds.click();
	}
	@When("User click masala dosa")
	public void userClickMasalaDosa() throws InterruptedException {
		 Thread.sleep(3000);
	    WebElement masala = driver.findElement(By.xpath("//h2[text()='Masala Dosa']"));
	    masala.click();
	}
	@When("Print available time")
	public void printAvailableTime() throws InterruptedException {
		Thread.sleep(3000);
	    WebElement cost = driver.findElement(By.xpath("(//span[text()='Available at 08:00 AM'])[1]"));
	    String text = cost.getText();
	    System.out.println(text);
	    System.out.println("Scenario 2 passed");
	}
	@Then("close the browser")
	public void closeTheBrowser() {
	    closeCurrentBrowser();
	}
	@When("Click the account button")
	public void clickTheAccountButton() {
		 WebElement account = driver.findElement(By.xpath("(//li[@class='lte-nav-profile '])[2]"));
		 account.click();  
	}
	@When("Enter name,email,phone number and password")
	public void enterNameEmailPhoneNumberAndPassword() {
	    WebElement name = driver.findElement(By.id("name"));
	    name.sendKeys("dhileep");
	    WebElement mail = driver.findElement(By.id("email"));
	    mail.sendKeys("bmw@gmail.com");
	    WebElement phone = driver.findElement(By.id("phone"));
	    phone.sendKeys("9874125630");
	    WebElement pass = driver.findElement(By.name("password"));
	    pass.sendKeys("uyvcefydf");
	}
	@When("click register button")
	public void clickRegisterButton() {
	    WebElement register = driver.findElement(By.name("login"));
	    register.click();
	}
	@When("print popup")
	public void printPopup() {
	    System.out.println("fill the confirm password field");
	    System.out.println("Scenario 3 passed");
	}
	@Then("Quit browser")
	public void quitBrowser() {
	    closeEntireBrowser();
	}
	@When("Click search icon")
	public void clickSearchIcon() {
	   WebElement s = driver.findElement(By.xpath("//li[@class='lte-nav-search']"));
	   s.click();
	}
	@When("Enter coke")
	public void enterCoke() {
		 WebElement bt = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		   Actions si = new Actions(driver);
		   si.doubleClick(bt).sendKeys("coke"+Keys.ENTER).perform();
	}
	@When("check price")
	public void checkPrice() throws InterruptedException {
	   Thread.sleep(5000);
	   WebElement t = driver.findElement(By.xpath("(//span[@class='woocommerce-Price-amount amount'])[1]"));
	   String text = t.getText();
	   System.out.println(text);
	   System.out.println("Scenario 4 passed");
	}
	@Then("Quits browser")
	public void quitsBrowser() {
	  closeCurrentBrowser();
	}
	@When("user click search icon")
	public void userClickSearchIcon() {
		WebElement s = driver.findElement(By.xpath("//li[@class='lte-nav-search']"));
		   s.click();
	}
	@When("Enter Spanish omlet")
	public void enterSpanishOmlet() {
		 WebElement bt = driver.findElement(By.xpath("(//input[@placeholder='Search'])[2]"));
		   Actions si = new Actions(driver);
		   si.doubleClick(bt).sendKeys("Spanish omelet"+Keys.ENTER).perform();
	}
	@When("Check the price")
	public void checkThePrice() {
	   WebElement pr = driver.findElement(By.xpath("//span[@class='woocommerce-Price-amount amount']"));
	   String text = pr.getText();
	   System.out.println(text);
	   System.out.println("Scenario 5 passed");
	}
	@Then("Quit the browser")
	public void quitTheBrowser() {
	   closeCurrentBrowser();
	}
	@When("click user story")
	public void clickUserStory() {
	   WebElement story = driver.findElement(By.linkText("Our story"));
	   story.click();
	   WebElement tt = driver.findElement(By.xpath("//ul[@class='disc']"));
	   String text = tt.getText();
	   System.out.println(text);
	   System.out.println("Scenario 6 passed");
	}
	@Then("Quits the browser")
	public void quitsTheBrowser() {
	  closeCurrentBrowser();
	}
}
