package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OpenUrlTest {
    public static void main(String[] args) {

// objects and variables instantiation
        WebDriver driver = new ChromeDriver();
        String appUrl = "https://www.google.com/";

// launch the firefox browser and open the application url
        driver.get(appUrl);

// maximize the browser window
        driver.manage().window().maximize();

// close the web browser
        driver.close();
        System.out.println("Test script executed successfully.");

// terminate the program
        System.exit(0);
    }
}
