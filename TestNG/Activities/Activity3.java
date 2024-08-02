package activities;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Activity3 {
	WebDriver driver;
	  @Test
	  public void f() {
		  driver.findElement(By.id("username")).sendKeys("admin");
		  driver.findElement(By.id("password")).sendKeys("password");
		  driver.findElement(By.xpath("//button[text()='Log in']")).click();
		  assertEquals("Welcome Back, admin", driver.findElement(By.id("action-confirmation")));
	  }
	  @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
		  driver.get("https://v1.training-support.net/selenium/login-form");
	  }

	  @AfterClass
	  public void afterClass() {
		  driver.close();
	  }

	}
