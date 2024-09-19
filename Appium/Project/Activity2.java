package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAppPackage("com.google.android.keep");
        options.setAppActivity(".activities.BrowseActivity");
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void addNote(){
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"New text note\"]")).click();
        driver.findElement(AppiumBy.id("com.google.android.keep:id/editable_title")).sendKeys("Appium");
        driver.findElement(AppiumBy.id("com.google.android.keep:id/edit_note_text")).sendKeys("Mobile testing");
        driver.findElement(AppiumBy.xpath("//android.widget.ImageButton[@content-desc=\"Navigate up\"]")).click();

        String note= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Appium']")).getText();
        Assert.assertEquals(note, "Appium");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}