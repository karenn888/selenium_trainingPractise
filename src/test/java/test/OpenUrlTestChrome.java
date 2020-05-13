package test;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindAll;
import org.openqa.selenium.support.FindBy;

import java.util.concurrent.TimeUnit;

public class OpenUrlTestChrome {
    @Test
    void test(){
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\practise\\practise04\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        String url = "https://www.google.com/";
        driver.get(url);
        driver.manage().window().maximize();
        WebElement inputData = driver.findElement(By.xpath("//input[@class = 'gLFyf gsfi']"));
        inputData.clear();
        inputData.sendKeys("selenium");
        WebElement btnSearch = driver.findElement(By.xpath("//span[@class='wFncld z1asCe MZy1Rb']"));
        btnSearch.click();
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        driver.close();
        System.out.println("Test script executed successfully.");
    }
}
