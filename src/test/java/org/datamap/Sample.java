package org.datamap;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Sample {
	WebDriver driver;
	@Given("User navigate to app")
	public void userNavigateToApp() {
	    driver = new ChromeDriver();
	    driver.get("https://bookcart.azurewebsites.net/");
	    driver.manage().window().maximize();
	    
	}

	@When("User click login button")
	public void userClickLoginButton() {
	    driver.findElement(By.xpath("//span[text()='Login']")).click();
	    
	}

	@When("User enter the username")
	public void userEnterTheUsername() {
	    driver.findElement(By.id("mat-input-0")).sendKeys("dhileep97");
	    
	}

	@When("User enter the password")
	public void userEnterThePassword() {
	    driver.findElement(By.id("mat-input-1")).sendKeys("BookCart@97");
	    
	}
	
	@When("User clicks login button")
	public void userClicksLoginButton() {
	    driver.findElement(By.xpath("//button[@class='mat-focus-indicator mat-raised-button mat-button-base mat-primary']")).click();
	}
	
	@Then("Login should be success")
	public void loginShouldBeSuccess() throws InterruptedException {
		Thread.sleep(3000);
	    String text = driver.findElement(By.xpath("//button[contains(@class,'mat-focus-indicator mat-menu-trigger')]//span[1]")).getText();
	    System.out.println(text);
	    
	}

}
