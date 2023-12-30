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
public class AppiumSearchTicketTest {
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
    // UTCID01: Expected result: Show list of route
    public void testSearchTicketID01() throws InterruptedException {
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.example.finalproject:id/listviewCity\"]/android.widget.LinearLayout[1]"));
        startPointChoose.click();
        Thread.sleep(500);
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
        MobileElement ticketElement = driver.findElement(By.id("com.example.finalproject:id/recycleviewTicket")); // Thay thế bằng ID của phần tử vé trên giao diện
        Assert.assertNotNull("Ticket should be found", ticketElement);
        System.out.println("Ve da duoc tim thay!");
        //Kiểm tra xem có tìm thấy vé hay không
//        try {
//            MobileElement ticketElement = driver.findElement(By.id("com.example.finalproject:id/recycleviewTicket")); // Thay thế bằng ID của phần tử vé trên giao diện
//            Assert.assertNotNull("Ticket should be found", ticketElement);
//            System.out.println("Ve da duoc tim thay!");
//        } catch (Exception e) {
//            System.out.println("Khong tim thay ve!");
//            e.printStackTrace(); // Hiển thị chi tiết lỗi (nếu có)
//            Assert.fail("Fail"); // Gán test case là fail
//        }
    }

    @Test
    // UTCID02: Expected result: Show empty list
    public void testSearchTicketID02() throws InterruptedException {
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        Thread.sleep(500);
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Vinh Long\"]"));
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
        MobileElement ticketElement = null;
        try {
            ticketElement = driver.findElement(By.id("com.example.finalproject:id/recycleviewTicket"));
        } catch (Exception e) {
            // Bỏ qua lỗi không tìm thấy phần tử
        }
        Assert.assertNull("Ticket shouldn't be found", ticketElement);
        System.out.println("Ve khong duoc tim thay!");
    }
    @Test
    // UTCID03: Log message: "Please choose start point"
    public void testSearchTicketID03() throws InterruptedException {
        Thread.sleep(500);
        MobileElement searchButton = driver.findElement(By.id("com.example.finalproject:id/buttonSearchTickets"));
        searchButton.click();
        Thread.sleep(500);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please choose start point.\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please choose start point.\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please choose start point.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID04: Log message: "Please choose departure date."
    public void testSearchTicketID04() throws InterruptedException {
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        Thread.sleep(500);
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.example.finalproject:id/listviewCity\"]/android.widget.LinearLayout[1]"));
        startPointChoose.click();
        MobileElement endPointText = driver.findElement(By.id("com.example.finalproject:id/textViewEndPoint"));
        endPointText.click();
        Thread.sleep(500);
        MobileElement endPointChoose = driver.findElement(By.xpath("//android.widget.TextView[@resource-id=\"com.example.finalproject:id/textviewNameCity\" and @text=\"Vinh Long\"]"));
        endPointChoose.click();
        Thread.sleep(500);
        MobileElement searchButton = driver.findElement(By.id("com.example.finalproject:id/buttonSearchTickets"));
        searchButton.click();
        Thread.sleep(500);
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please choose departure date.\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please choose departure date.\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please choose departure date.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID05: Log message: "Please choose end point."
    public void testSearchTicketID05() throws InterruptedException {
        MobileElement startPointText = driver.findElement(By.id("com.example.finalproject:id/textViewStartPoint"));
        startPointText.click();
        Thread.sleep(500);
        MobileElement startPointChoose = driver.findElement(By.xpath("//android.widget.ListView[@resource-id=\"com.example.finalproject:id/listviewCity\"]/android.widget.LinearLayout[1]"));
        startPointChoose.click();
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
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please choose end point.\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please choose end point.\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please choose end point.";
        if (!expectedMessage.equals(actualMessage)) {
            System.out.println("Message is not as expected. Actual message: " + actualMessage);
            // Thực hiện các hành động hoặc ghi log bổ sung nếu cần
            Assert.fail("Fail"); // Gán test case là fail
        } else {
            System.out.println("Message is as expected: " + actualMessage);
        }
    }
    @Test
    // UTCID06: Log message: "Please choose start point"
    public void testSearchTicketID06() throws InterruptedException {
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
        WebDriverWait wait = new WebDriverWait(driver, 5);
        wait.until(ExpectedConditions.presenceOfElementLocated(MobileBy.xpath("//android.widget.Toast[@text=\"Please choose start point.\"]")));
        MobileElement messageElement = driver.findElement(By.xpath("//android.widget.Toast[@text=\"Please choose start point.\"]"));
        String actualMessage = messageElement.getText();
        String expectedMessage = "Please choose start point.";
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

