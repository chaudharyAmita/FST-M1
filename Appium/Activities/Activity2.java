package examples;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;

public class Activity2 {

    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException {
// Desired Capabilities
        UiAutomator2Options options = new UiAutomator2Options();
        options.setPlatformName("android");
        options.setAutomationName("UiAutomator2");
        options.setAppPackage("com.android.chrome");
        options.setAppActivity("com.google.android.apps.chrome.Main");

// Server Address
        URL serverURL = new URL("http://localhost:4723/wd/hub");
// Driver Initialization
        driver = new AndroidDriver(serverURL, options);
        driver.get("https://www.training-support.net/");
    }

    @Test
    public void openBrowser(){


         wait.until(ExpectedConditions.presenceOfElementLocated(
                AppiumBy.xpath("//android.view.View[@text='Training Support']")
        ));
        //driver.findElement(AppiumBy.xpath("//android.view.View[@text='Training Support']")).getText();
        //System.out.println(title);

        driver.findElement(AppiumBy.xpath("//android.view.View[@resource-id='about-link']")).click();
        String aboutTitle = driver.findElement(AppiumBy.xpath("//android.view.View[@text='About Us']")).getText();
        System.out.println(aboutTitle);

    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}