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
public class AppiumBookTicketTest {
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
    // UTCID01: Log message: "Please choose a seat."
    public void testBookTicketID01() throws InterruptedException {
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
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.example.finalproject:id/listviewCity\"]/android.widget.LinearLayout[1]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Vinh Long\"]"));
        endPointChoose.click();
        Thread.sleep(500);
        MobileElement dateText = driver.findElement(By.id("com.example.finalproject:id/textViewDate"));
        dateText.click();
        Thread.sleep(500);
        MobileElement el10 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]"));
        el10.click();
        MobileElement dateChoose = driver.findElement(By.xpath("//android.view.View[@content-desc=\"03 November 2023\"]"));
        dateChoose.click();
        MobileElement dateConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirm"));
        dateConfirm.click();
        Thread.sleep(500);
        MobileElement searchButton = driver.findElement(By.id("com.example.finalproject:id/buttonSearchTickets"));
        searchButton.click();
        Thread.sleep(500);
        MobileElement ticketChoose = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.example.finalproject:id/linearTicket\"]/android.widget.LinearLayout"));
        ticketChoose.click();
        Thread.sleep(500);
        MobileElement editInfo = driver.findElement(By.id("com.example.finalproject:id/buttonNextCusinfo"));
        editInfo.click();
        Thread.sleep(2000);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please choose a seat\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please choose a seat\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please choose a seat";
        // Sử dụng assert để kiểm tra xem actualMessage có giống với expectedMessage hay không
//        Assert.assertEquals("Message should be as expected", expectedMessage, actualMessage);
//        System.out.println("Da dat ve thanh cong");
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID02: Log message: "Successful ticket booking"
    public void testBookTicketID02() throws InterruptedException {
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
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.example.finalproject:id/listviewCity\"]/android.widget.LinearLayout[1]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Vinh Long\"]"));
        endPointChoose.click();
        Thread.sleep(500);
        MobileElement dateText = driver.findElement(By.id("com.example.finalproject:id/textViewDate"));
        dateText.click();
        Thread.sleep(500);
        MobileElement el10 = driver.findElement(By.xpath("//android.widget.ImageButton[@content-desc=\"Previous month\"]"));
        el10.click();
        MobileElement dateChoose = driver.findElement(By.xpath("//android.view.View[@content-desc=\"03 November 2023\"]"));
        dateChoose.click();
        MobileElement dateConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirm"));
        dateConfirm.click();
        Thread.sleep(500);
        MobileElement searchButton = driver.findElement(By.id("com.example.finalproject:id/buttonSearchTickets"));
        searchButton.click();
        Thread.sleep(500);
        MobileElement ticketChoose = driver.findElement(By.xpath("//android.widget.LinearLayout[@resource-id=\"com.example.finalproject:id/linearTicket\"]/android.widget.LinearLayout"));
        ticketChoose.click();
        Thread.sleep(500);
        MobileElement seatChoose = driver.findElement(By.id("com.example.finalproject:id/seat_4=a_upstair"));
        seatChoose.click();
        Thread.sleep(500);
        MobileElement editInfo = driver.findElement(By.id("com.example.finalproject:id/buttonNextCusinfo"));
        editInfo.click();
        Thread.sleep(500);
        MobileElement ticketConfirm = driver.findElement(By.id("com.example.finalproject:id/buttonConfirmInfo"));
        ticketConfirm.click();
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Successful ticket booking\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Successful ticket booking\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Successful ticket booking";
        // Sử dụng assert để kiểm tra xem actualMessage có giống với expectedMessage hay không
//        Assert.assertEquals("Message should be as expected", expectedMessage, actualMessage);
//        System.out.println("Da dat ve thanh cong");
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
