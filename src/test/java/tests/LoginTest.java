package tests;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import utils.DriverFactory;

public class LoginTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        driver = DriverFactory.initDriver();
        driver.get("https://example.com");

        System.out.println("Running Login Test on Thread: " + Thread.currentThread().getName());
    }

    @AfterMethod
    public void tearDown() {

        DriverFactory.quitDriver();
    }
}