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

public class AppiumLoginTest {
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
    // UTCID01: Log message: "Please input Username!"
    public void testLoginID01() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please input Username!\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please input Username!\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please input Username!";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID02: Log message: "Please input Password!"
    public void testLoginID02() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("linhchi@gmail.com");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please input Password!\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please input Password!\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please input Password!";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID03: Log message: "Authentication failed."
    public void testLoginID03() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("linhchi@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("123333");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Authentication failed.\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Authentication failed.\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Authentication failed.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID04: Log message: "Authentication failed."
    public void testLoginID04() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("linhchi");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("linhchi");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 2);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Authentication failed.\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Authentication failed.\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Authentication failed.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID05: Return: True
    public void testLoginID05() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("phamtung@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("123456");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(2000);
        MobileElement accountButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        accountButton.click();
        Thread.sleep(500);
        MobileElement accountInfo = driver.findElement(By.id("com.example.finalproject:id/textviewUserName"));
        if (accountInfo.isDisplayed()) {
            System.out.println("Login successful");
        } else {
            System.out.println("Fail");
        }
    }
    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
