package activities;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;

import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity5 {
	WebDriver driver;
	
	  @Test (groups = {"HeaderTests", "ButtonTests"})
	    public void pageTitleTest() {
	        String title = driver.getTitle();
	        System.out.println("Title is: " + title);
	        assertEquals(title, "Target Practice");
	    }
	  
	  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
	    public void HeaderTest1() {
	        WebElement header3 = driver.findElement(By.cssSelector("h3#third-header"));
	        assertEquals(header3.getText(), "Third header");
	    }
	  
	  @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"HeaderTests"})
	    public void HeaderTest2() {
	        WebElement header5 = driver.findElement(By.className("ui green header"));
	        assertEquals(header5.getCssValue("color"), "rgb(251, 189, 8)");
	    }
	    
	    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
	    public void ButtonTest1() {
	        WebElement button1 = driver.findElement(By.cssSelector("button.olive"));
	        assertEquals(button1.getText(), "Olive");
	    }
	    
	    @Test (dependsOnMethods = {"pageTitleTest"}, groups = {"ButtonTests"})
	    public void ButtonTest2() {
	        WebElement button2 = driver.findElement(By.cssSelector("button.brown"));
	        assertEquals(button2.getCssValue("color"), "rgb(255, 255, 255)");
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
