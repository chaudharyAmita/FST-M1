package activities;

/*import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.By;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import java.net.MalformedURLException;
import java.net.URL;

public class Activity3 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException{

        UiAutomator2Options options= new UiAutomator2Options();
        options.setAutomationName("UiAutomator2");
        options.setPlatformName("android");
        options.setAppActivity("com.google.android.apps.chrome.Main");
        options.setAppPackage("com.android.chrome");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
    }

    @Test
    public void addTask(){
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(AppiumBy.androidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(text(\"To-Do List\"))")).click();
          //  driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[1]/android.widget.Button[2]")).click();
           // driver.findElement(AppiumBy.xpath("\t\n" +
                  //  "//android.view.View[@content-desc=\"To-Do List Elements get added at run time\"]/android.view.View[1]")).click();
            driver.findElement(AppiumBy.xpath("//android.widget.EditText[@id='taskInput']")).sendKeys("Add tasks to list");
            driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

       // driver.findElement(AppiumBy.id("\t\n" +
              //  "taskInput")).sendKeys("Get number of tasks");
        //driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button")).click();

       // driver.findElement(AppiumBy.id("\t\n" +
              //  "taskInput")).sendKeys("Clear the list");
       // driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.Button")).click();

        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View")).click();
        //driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[2]")).click();
       // driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[2]/android.view.View[3]")).click();
        driver.findElement(AppiumBy.xpath("\t\n" +
                "/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[3]")).click();
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}*/

import io.appium.java_client.AppiumBy;
import io.appium.java_client.MobileBy;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

public class Activity3 {
    AndroidDriver driver;

    @BeforeClass
    public void setUp() throws MalformedURLException {
        DesiredCapabilities dcap = new DesiredCapabilities();
        dcap.setCapability("platformName","Android");
        dcap.setCapability("automationName","UiAutomator2");
        dcap.setCapability("deviceName","Alamgir's M51");
        dcap.setCapability("appPackage", "com.android.chrome");
        dcap.setCapability("appActivity","com.google.android.apps.chrome.Main");
        dcap.setCapability("noReset", true);

        URL appServer = new URL("http://127.0.0.1:4723/wd/hub");
        driver= new AndroidDriver(appServer,dcap);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void googleChromeTest() {
        driver.get("https://www.training-support.net/selenium");
        String UiScrollable = "UiScrollable(UiSelector().scrollable(true))";
        driver.findElement(MobileBy.AndroidUIAutomator(UiScrollable + ".scrollForward(4).scrollIntoView(text(\"To-Do List\"))")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("Add tasks to list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.EditText[@resource-id='taskInput']")).sendKeys("Get number of tasks");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();
        driver.findElement(AppiumBy.xpath("/hierarchy/android.widget.FrameLayout/android.widget.LinearLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.widget.FrameLayout/android.view.ViewGroup/android.widget.FrameLayout[1]/android.widget.FrameLayout[2]/android.webkit.WebView/android.view.View/android.view.View[3]/android.view.View[1]/android.widget.EditText")).sendKeys("Clear the list");
        driver.findElement(AppiumBy.xpath("//android.widget.Button[@text='Add Task']")).click();

        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Add tasks to list']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Get number of tasks']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Clear the list']")).click();
        driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='\uF1F8']")).click();

        int taskCount= driver.findElements(AppiumBy.xpath("//com.android.chrome[@resource-id='tasksCard']")).size();
        Assert.assertEquals(taskCount,0);


    }

    @AfterClass
    public void closeTest(){
        driver.quit();
    }
}