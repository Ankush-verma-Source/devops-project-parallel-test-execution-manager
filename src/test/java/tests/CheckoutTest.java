package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class CheckoutTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();

        driver.get("https://example.com");

    }

    @Test
    public void checkoutTest() {

        System.out.println("Running Checkout Test on Thread: " + Thread.currentThread().getName());

    }

    @AfterMethod
    public void teardown(){

        DriverFactory.quitDriver();

    }

}