package com.example.finalproject;
import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumAddRouteTest {
    private AppiumDriver<MobileElement> driver;

    @Before
    public void setUp() throws MalformedURLException {
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        capabilities.setCapability(MobileCapabilityType.PLATFORM_VERSION, "your_android_version");
        capabilities.setCapability(MobileCapabilityType.UDID, "your_device_udid");
        capabilities.setCapability(MobileCapabilityType.APP, "path/to/your/app.apk");
        capabilities.setCapability("appPackage", "your_app_package");
        capabilities.setCapability("appActivity", "your_app_activity");

        URL url = new URL("http://127.0.0.1:4723/wd/hub");
        driver = new AndroidDriver<>(url, capabilities);
    }

    @Test
    public void testAddRoute() {
        // Thực hiện các thao tác nhập liệu và bấm nút "Add" sử dụng Appium

        // Ví dụ: nhập thông tin điểm xuất phát
        MobileElement startPoint = driver.findElement(By.id("your_start_point_element_id"));
        startPoint.click();

        // Điều hướng đến màn hình chọn thành phố và kiểm tra
        // (Sử dụng các phương thức findElement và click của Appium)
        MobileElement chooseCityElement = driver.findElement(By.id("your_choose_city_element_id"));
        chooseCityElement.click();

        // Tiếp tục với các bước kiểm thử tiếp theo, tương tự cho các trường khác.

        // Cuối cùng, kiểm tra kết quả
        // (Sử dụng các phương thức assert của Java hoặc thư viện kiểm thử)
    }

    @After
    public void tearDown() {
        if (driver != null) {
            driver.quit();
        }
    }
}
