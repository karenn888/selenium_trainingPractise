package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class MicrosoftEdgeChromium {
    @Test
    void openUrl(){
        File edgeChromium = new File("drivers/msedgedriver.exe");
        System.setProperty("webdriver.edge.driver", edgeChromium.getAbsolutePath());
        WebDriver driver = new EdgeDriver();
        String url = "https://www.google.com/";
        driver.get(url);
        driver.manage().window().maximize();
        driver.close();
    }
}
