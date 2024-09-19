package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver driver;

    @BeforeClass
    public void beforeClass() throws MalformedURLException {
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.calculator2");
        options.setAppActivity(".Calculator");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void operations(){
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_5")).click();
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/op_add")).click();
        driver.findElement(AppiumBy.id("com.google.android.calculator:id/digit_9")).click();
        driver.findElement(AppiumBy.accessibilityId("equals")).click();
        String result = driver.findElement(AppiumBy.id("result")).getText();
        Assert.assertEquals(result, "500");
    }



    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}