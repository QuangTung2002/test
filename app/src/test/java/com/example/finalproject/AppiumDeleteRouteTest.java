package com.example.finalproject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDeleteRouteTest {
    private AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.DEVICE_NAME, "emulator-5554");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.APP, "C:\\\\Users\\\\computer\\\\test\\\\app\\\\build\\\\outputs\\\\apk\\\\debug\\\\app-debug.apk");
        URL url = new URL("http://localhost:4723/wd/hub");
        driver = new AndroidDriver<>(url, capabilities);
    }
    @Test
    // UTCID01: Log message: "Can't delete booked route"
    public void testDeleteRouteID01() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(2000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement findRoute = driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.example.finalproject:id/linearTicket\"])[1]/android.widget.LinearLayout"));
        findRoute.click();
        Thread.sleep(500);
        MobileElement deleteRoute = driver.findElement(By.id("com.example.finalproject:id/textviewDeleteRoute"));
        deleteRoute.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Can't delete booked route\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Can't delete booked route\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Can't delete booked route";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID02: Log message: "Route deleted successfully"
    public void testDeleteRouteID02() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(2000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement findRoute = driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.example.finalproject:id/linearTicket\"])[2]/android.widget.LinearLayout"));
        findRoute.click();
        Thread.sleep(500);
        MobileElement deleteRoute = driver.findElement(By.id("com.example.finalproject:id/textviewDeleteRoute"));
        deleteRoute.click();
        Thread.sleep(500);
        MobileElement confirmDelete = driver.findElement(By.id("android:id/button1"));
        confirmDelete.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Route deleted successfully\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Route deleted successfully\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Route deleted successfully";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
