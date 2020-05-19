package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.io.File;

public class MicrosoftEdgeHtmlTest {
    @Test
    void openEdgeBrowser(){
//        File edgeDriver = new File("drivers/MicrosoftWebDriver.exe");
//        System.setProperty("webdriver.edge.driver", edgeDriver.getAbsolutePath());
        WebDriver driver = new EdgeDriver();
        String url = "https://www.google.com/";
        driver.get(url);
        driver.close();
    }
}
