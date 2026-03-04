package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.net.URL;

public class DriverFactory {

    public static WebDriver driver;

    public static WebDriver initDriver() {
        try {

            ChromeOptions options = new ChromeOptions();
            options.addArguments("--headless");
            options.addArguments("--no-sandbox");
            options.addArguments("--disable-dev-shm-usage");

            driver = new RemoteWebDriver(
                    new URL("http://selenium-hub:4444/wd/hub"),
                    options
            );

        } catch (Exception e) {
            e.printStackTrace();
        }

        return driver;
    }

    public static WebDriver getDriver() {
        return driver;
    }
}