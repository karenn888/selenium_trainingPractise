package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.opera.OperaDriver;

import java.io.File;

public class OperaChromium {
    @Test
    void openUrl(){
        File operaChromium = new File("drivers/operadriver.exe");
        System.setProperty("webdriver.opera.driver", operaChromium.getAbsolutePath());
        WebDriver driver = new OperaDriver();
        String url = "https://www.google.com/";
        driver.get(url);
        driver.quit();
    }
}
