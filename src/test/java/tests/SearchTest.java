package tests;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import utils.DriverFactory;
import org.openqa.selenium.WebDriver;

public class SearchTest {

    WebDriver driver;

    @BeforeMethod
    public void setup() {

        DriverFactory.initDriver();
        driver = DriverFactory.getDriver();

        driver.get("https://example.com");

    }

    @Test
    public void searchTest() {

        System.out.println("Running Search Test on Thread: " + Thread.currentThread().getName());

    }

    @AfterMethod
    public void teardown(){

        DriverFactory.quitDriver();

    }

}