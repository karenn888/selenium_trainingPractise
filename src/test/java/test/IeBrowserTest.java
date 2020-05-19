package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import java.io.File;

public class IeBrowserTest {
    @Test
    void testIE(){
//        File internetExplorer = new File("E:\\Automation\\practise\\practise04\\drivers\\IEDriverServer.exe");
        System.setProperty("webdriver.ie.driver", "E:\\Automation\\practise\\practise04\\drivers\\IEDriverServer.exe");
        WebDriver driver = new InternetExplorerDriver();
        String url = "https://www.google.com/";
        driver.navigate().to(url);
//        driver.get(url);
        driver.close();
    }
}
