package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.io.File;

public class DemoTest {

    @Test
    void test() {
        // Set webdriver.chrome.driver
        File chromeDriver = new File("drivers/chromedriver.exe");
        System.setProperty("webdriver.chrome.driver", chromeDriver.getAbsolutePath());

        // objects and variables instantiation
        WebDriver driver = new ChromeDriver();
        String appUrl = "https://www.google.com/";

        // launch the chrome browser and open the application url
        driver.get(appUrl);

        // maximize the browser window
        driver.manage().window().maximize();

        // close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");
    }
}

