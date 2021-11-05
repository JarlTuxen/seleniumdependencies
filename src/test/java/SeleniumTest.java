import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class SeleniumTest {

    @Test
    public void fireFoxTest(){
        //set headless with options in FirefoxDriver constructor
        FirefoxOptions options = new FirefoxOptions();
        options.setHeadless(false);
        WebDriver driver = new FirefoxDriver(options);
        //get webpage
        driver.get("http://demo.guru99.com/");
        //find email input field and enter mail address
        WebElement element = driver.findElement(By.name("emailid"));
        element.sendKeys("abc@gmail.com");
        //find login button and click
        WebElement button = driver.findElement(By.name("btnLogin"));
        button.click();
        //clean up browserdriver - if visible close tab used
        System.out.println("Title of page is: " + driver.getTitle());
        assertTrue(driver.getTitle().equals("Guru99 Bank Home Page"));
        //driver.wait(3000);
        driver.close();
    }
}
