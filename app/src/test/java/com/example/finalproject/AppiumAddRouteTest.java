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

public class AppiumAddRouteTest {
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
    // UTCID01: Log message: "Please fill in all information"
    public void testAddRouteID01() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(1000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please fill in all information.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }

    @Test
    // UTCID02: Log message: "Please fill in all information"
    public void testAddRouteID02() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(3000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"TP Ho Chi Minh\"]"));
        startPointChoose.click();
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please fill in all information.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }

    @Test
    // UTCID03: Log message: "Please fill in all information"
    public void testAddRouteID03() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(3000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"TP Ho Chi Minh\"]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Ha Noi\"]"));
        endPointChoose.click();
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please fill in all information.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID04: Log message: "Please fill in all information"
    public void testAddRouteID04() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(3000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"TP Ho Chi Minh\"]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Ha Noi\"]"));
        endPointChoose.click();
        MobileElement dateText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureDate"));
        dateText.click();
        Thread.sleep(500);
        MobileElement dateChoose = driver.findElement(By.xpath("//android.view.View[@content-desc=\"29 December 2023\"]"));
        dateChoose.click();
        Thread.sleep(500);
        MobileElement dateConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirm"));
        dateConfirm.click();
        Thread.sleep(500);
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please fill in all information.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID05: Log message: "Please fill in all information"
    public void testAddRouteID05() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(3000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"TP Ho Chi Minh\"]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Ha Noi\"]"));
        endPointChoose.click();
        MobileElement dateText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureDate"));
        dateText.click();
        Thread.sleep(500);
        MobileElement dateChoose = driver.findElement(By.xpath("//android.view.View[@content-desc=\"29 December 2023\"]"));
        dateChoose.click();
        Thread.sleep(500);
        MobileElement dateConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirm"));
        dateConfirm.click();
        Thread.sleep(500);
        MobileElement timeText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureTime"));
        timeText.click();
        Thread.sleep(500);
        MobileElement timeConfirm = driver.findElement(By.id("android:id/button1"));
        timeConfirm.click();
        Thread.sleep(500);
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please fill in all information.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID06: Log message: "Please fill in all information"
    public void testAddRouteID06() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(3000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"TP Ho Chi Minh\"]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Ha Noi\"]"));
        endPointChoose.click();
        MobileElement dateText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureDate"));
        dateText.click();
        Thread.sleep(500);
        MobileElement dateChoose = driver.findElement(By.xpath("//android.view.View[@content-desc=\"29 December 2023\"]"));
        dateChoose.click();
        Thread.sleep(500);
        MobileElement dateConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirm"));
        dateConfirm.click();
        Thread.sleep(500);
        MobileElement timeText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureTime"));
        timeText.click();
        Thread.sleep(500);
        MobileElement timeConfirm = driver.findElement(By.id("android:id/button1"));
        timeConfirm.click();
        Thread.sleep(500);
        MobileElement carText = driver.findElement(By.id("com.example.finalproject:id/textviewXe"));
        carText.click();
        Thread.sleep(500);
        MobileElement carChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNumberXe\" and @text=\"123\"]"));
        carChoose.click();
        Thread.sleep(500);
        MobileElement addRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddRoute"));
        addRouteButton.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Upload successful\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Upload successful\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please fill in all information.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }

    }
    @Test
    // UTCID07: Log message: "Upload successful"
    public void testAddRouteID07() throws InterruptedException {
        MobileElement signinButton = driver.findElement(By.id("com.example.finalproject:id/textviewSignin"));
        signinButton.click();
        Thread.sleep(500);
        MobileElement usernameEditText = driver.findElement(By.id("com.example.finalproject:id/editTextUsername"));
        usernameEditText.sendKeys("imadmin@gmail.com");
        MobileElement passwordEditText = driver.findElement(By.id("com.example.finalproject:id/editTextPass"));
        passwordEditText.sendKeys("admin123");
        MobileElement loginButton = driver.findElement(By.id("com.example.finalproject:id/buttonLogin"));
        loginButton.click();
        Thread.sleep(3000);
        MobileElement manageRouteText = driver.findElement(By.id("com.example.finalproject:id/textviewManageRoute"));
        manageRouteText.click();
        Thread.sleep(500);
        MobileElement addNewRouteButton = driver.findElement(By.id("com.example.finalproject:id/buttonAddNewRoute"));
        addNewRouteButton.click();
        Thread.sleep(1000);
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"TP Ho Chi Minh\"]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Ha Noi\"]"));
        endPointChoose.click();
        MobileElement dateText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureDate"));
        dateText.click();
        Thread.sleep(500);
        MobileElement dateChoose = driver.findElement(By.xpath("//android.view.View[@content-desc=\"29 December 2023\"]"));
        dateChoose.click();
        Thread.sleep(500);
        MobileElement dateConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirm"));
        dateConfirm.click();
        Thread.sleep(500);
        MobileElement timeText = driver.findElement(By.id("com.example.finalproject:id/textviewDepartureTime"));
        timeText.click();
        Thread.sleep(500);
        MobileElement timeConfirm = driver.findElement(By.id("android:id/button1"));
        timeConfirm.click();
        Thread.sleep(500);
        MobileElement carText = driver.findElement(By.id("com.example.finalproject:id/textviewXe"));
        carText.click();
        Thread.sleep(500);
        MobileElement carChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNumberXe\" and @text=\"123\"]"));
        carChoose.click();
        Thread.sleep(500);
        MobileElement priceEdit = driver.findElement(By.id("com.example.finalproject:id/edittextPrice"));
        priceEdit.sendKeys("120000");
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


    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
