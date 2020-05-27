package test;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import java.util.concurrent.TimeUnit;

public class ChromeBrowserTest {
    WebDriver driver;
    @BeforeEach
    void setUp(){
        System.setProperty("webdriver.chrome.driver", "E:\\Automation\\practise\\practise04\\drivers\\chromedriver.exe");
        driver = new ChromeDriver();
        String url = "http://automationpractice.com/index.php";
        driver.get(url);
        driver.manage().window().maximize();
    }

    @AfterEach
    void tearDown(){
        driver.quit();
    }

    @Test
    void test() throws InterruptedException {
        WebElement tabWomen = driver.findElement(By.xpath("//a[@title='Women']"));
        tabWomen.click();
        WebElement itemTop = driver.findElement(By.xpath("//a[@title='Tops' and @class='img']"));
        itemTop.click();
        WebElement itemTshirt = driver.findElement(By.xpath("//a[@title='T-shirts' and @class='img']"));
        itemTshirt.click();
        WebElement dropdownSortby = driver.findElement(By.id("selectProductSort"));
        Select selectByValue = new Select(dropdownSortby);
        selectByValue.selectByValue("price:asc");
        Thread.sleep(5000);
    }
}
