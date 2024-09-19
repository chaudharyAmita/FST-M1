package activities;

import io.appium.java_client.AppiumBy;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.options.UiAutomator2Options;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.concurrent.TimeUnit;

public class Activity1 {
    AndroidDriver driver;
    WebDriverWait wait;

    @BeforeClass
    public void setUp() throws MalformedURLException{
        UiAutomator2Options options = new UiAutomator2Options();
        options.setAutomationName("UiAutomator2");
        options.setPlatformName("android");
        options.setAppActivity(".ui.TaskListsActivity");
        options.setAppPackage("com.google.android.apps.tasks");
        options.noReset();

        URL serverURL = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver(serverURL, options);
        driver.manage().timeouts().implicitlyWait(3, TimeUnit.SECONDS);
    }

    @Test
    public void addTask1(){
       // wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        //driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/welcome_get_started")).click();
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Tasks");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        String task1= driver.findElement(AppiumBy.xpath("//android.widget.FrameLayout/android.view.ViewGroup/android.widget.TextView")).getText();
        Assert.assertEquals(task1,"Complete Activity with Google Tasks");
    }

    @Test
    public void addTask2(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete Activity with Google Keep");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        String task2= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete Activity with Google Keep']")).getText();
        Assert.assertEquals(task2,"Complete Activity with Google Keep");
    }

    @Test
    public void addTask3(){
        //wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        driver.findElement(AppiumBy.id("tasks_fab")).click();
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_title")).sendKeys("Complete the second Activity Google Keep");
        driver.findElement(AppiumBy.id("com.google.android.apps.tasks:id/add_task_done")).click();
        String task3= driver.findElement(AppiumBy.xpath("//android.widget.TextView[@text='Complete the second Activity Google Keep']")).getText();
        Assert.assertEquals(task3,"Complete the second Activity Google Keep");
    }

    @AfterClass
    public void tearDown(){
        driver.quit();
    }
}