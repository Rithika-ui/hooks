package STEPS3;

import java.time.Duration;

//import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps_Definition {
	
	
	WebDriver driver = hooks.driver;
	
	
	
	@When("User OPEN URL {string}")
	public void user_opens_url(String TESTURL) {
		driver.get(TESTURL);
	}
	
	@When("User PRESS username as {string} and password as {string}")
	public void user_press_username_as_and_password_as(String USERNAME, String PASSWORD) {
		driver.findElement(By.name("username")).sendKeys(USERNAME);
		driver.findElement(By.name("password")).sendKeys(PASSWORD);
        driver.findElement(By.xpath("//button[@type='submit']")).click();
	}
	
	@Then("NAVIGATE to PAY Page")
	public void navigate_to_languages_page() {
		driver.findElement(By.xpath("//span[text()='Admin']")).click();
        driver.findElement(By.xpath("//span[contains(.,'Job')]")).click();
        driver.findElement(By.xpath("//a[text()='Pay Grades']")).click();
        driver.findElement(By.xpath("//button[contains(.,'Add')]")).click();
	}
	
	@When("Add PAY Records with Pay as {string}")
	public void add_pay_records_with_pay_as(String PNAME) {
		driver.findElement(By.xpath("(//input[@class='oxd-input oxd-input--active'])[2]")).sendKeys(PNAME);
        driver.findElement(By.xpath("//button[contains(.,'Save')]")).click();
	}

	
	@When("CLICK on logout button")
	public void click_on_logout_button() {
	    //WELCOME
		//LOGOUT
	}
	
	

}
