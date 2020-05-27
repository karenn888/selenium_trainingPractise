package test;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

import java.net.MalformedURLException;
import java.net.URL;

public class Test11 {
    @Test
    void test() throws MalformedURLException {
        DesiredCapabilities capabilities = DesiredCapabilities.chrome();
        WebDriver webDriver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub/"), capabilities);
        webDriver.get("https://www.google.com/");
    }
}
