package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.io.File;

public class TestFirefox {
    @Test
    void testFirefox(){
        File firefoxDriver = new File("drivers/geckodriver.exe");
        System.setProperty("webdriver.gecko.driver", firefoxDriver.getAbsolutePath());
        WebDriver driver = new FirefoxDriver();
        String url = "https://www.google.com/";
        driver.get(url);
        driver.close();
    }
}
