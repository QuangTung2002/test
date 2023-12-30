package com.example.finalproject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.appium.java_client.touch.WaitOptions;
import io.appium.java_client.touch.offset.PointOption;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

public class AppiumUpdateRouteTest {
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
    // UTCID01: Log message: "Upload successful"
    public void testUpdateRouteID01() throws InterruptedException {
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
        Dimension size = driver.manage().window().getSize();
        Thread.sleep(500);
        // Tính toán tọa độ để cuộn từ dưới lên trên
        int startX = size.width / 2;
        int startY = (int) (size.height * 0.8);
        int endY = (int) (size.height * 0.2);
        // Thực hiện cuộn
        TouchAction<?> touchAction = new TouchAction<>(driver);
        touchAction
                .press(PointOption.point(startX, startY))
                .waitAction(WaitOptions.waitOptions(Duration.ofMillis(1000)))
                .moveTo(PointOption.point(startX, endY))
                .release()
                .perform();
        MobileElement findRoute = driver.findElement(By.xpath("(//android.widget.LinearLayout[@resource-id=\"com.example.finalproject:id/linearTicket\"])[4]/android.widget.LinearLayout"));
        findRoute.click();
        Thread.sleep(500);
        MobileElement priceEdit = driver.findElement(By.id("com.example.finalproject:id/edittextPrice"));
        priceEdit.sendKeys("50000");
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Upload successful";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID02: Log message: "Upload featured route successful"
    public void testUpdateRouteID02() throws InterruptedException {
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
        MobileElement priceEdit = driver.findElement(By.id("com.example.finalproject:id/edittextPrice"));
        priceEdit.sendKeys("50000");
        MobileElement featureEdit = driver.findElement(By.id("com.example.finalproject:id/radioButtonFeature"));
        featureEdit.click();
        MobileElement updateRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        updateRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload featured route successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload featured route successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Upload featured route successful";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID03: Log message: "Upload featured route successful"
    public void testUpdateRouteID03() throws InterruptedException {
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
        MobileElement priceEdit = driver.findElement(By.id("com.example.finalproject:id/edittextPrice"));
        priceEdit.sendKeys("50000");
        MobileElement featureEdit = driver.findElement(By.id("com.example.finalproject:id/radioButtonUnFeatureless"));
        featureEdit.click();
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload featured route successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload featured route successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Upload featured route successful";
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
