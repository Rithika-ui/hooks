package STEPS3;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.After;
import io.cucumber.java.Before;

public class hooks {
	
  
	 static WebDriver driver;
	 
	 //global hooks start
	 
	 @Before
	 public void user_start_chrome_browser() {
			driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
			System.out.println(" before hook passed");
		
		}
	 
	 
	 @After
	 public void close_browser() {
		    driver.quit();
		    System.out.println(" after hook passed");
		} 
	
	 //global hooks end
	 
	// tagged hook started
	 @Before("@talk")
	 public void TC02() {
	 System.out.println("tagged hook started ");
	        }
	 
	 
	 @Before("@walk")
	 public void TC03() {
	 System.out.println("tagged hook  ");
	        }
	// tagged hook ended
	 
	// common tagged hook started
	 
	 @Before("@talk or @walk")
	 public void TC04() {
		 System.out.println("COMMON TAGGED HOOK");
	 }
	 
	// common tagged hook ended
}
