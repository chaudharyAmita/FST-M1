package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.SkipException;
import org.testng.annotations.AfterClass;

public class Activity2 {
	WebDriver driver;
	  @Test
	  public void One() {
		  String title = driver.getTitle();
		  System.out.println("The title of the page is "+title);
		  assertEquals("Target Practice", title);
	  }
	  
	  @Test
	  public void Two() {
		  WebElement BlackButton = driver.findElement(By.cssSelector("button.black"));
		  assertTrue(BlackButton.isDisplayed());
		  assertEquals(BlackButton.getText(), "black");
	  }
	  
	  @Test(enabled = false)
	  public void three(){
		  System.out.println("three");
	  }
	  
	  @Test
	  public void four() {
		  String condition ="Skip Test";
		    if(condition.equals("Skip Test")){
			throw new SkipException("Skipping - This is not ready for testing ");
		    }
	  }
	  
	  @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://v1.training-support.net/selenium/target-practice");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	}
