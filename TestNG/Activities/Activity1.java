package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;
  @Test
  public void f() {
	  String title = driver.getTitle();
	  System.out.println("The title of the page is "+title);
	  assertEquals("Training Support", title);
	  driver.findElement(By.id("about-link")).click();
	  System.out.println("Title of the new page "+driver.getTitle());
	  assertEquals("About Training Support", driver.getTitle());
  }
  @BeforeClass
  public void beforeClass() {
	  WebDriverManager.firefoxdriver().setup();
	  driver = new FirefoxDriver();
	  driver.get("https://v1.training-support.net");
  }

  @AfterClass
  public void afterClass() {
	  driver.close();
  }

}
