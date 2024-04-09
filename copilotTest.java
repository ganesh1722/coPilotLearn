import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.util.concurrent.TimeUnit;

public class copilotTest {
    /*
    write a beforesuite method that initializes the driver from bonigarcia and opens google.com
     */
    @Test
    public void beforeSuite() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
//        thread.sleep(2000);
        driver.quit();
    }
/*write a new method to search for "Selenium" in google search and print the title of the page */
    @Test
    public void searchSelenium() {
        WebDriverManager.chromedriver().setup();
        ChromeDriver driver = new ChromeDriver();
        driver.get("https://www.google.com");
        driver.findElementByName("q").sendKeys("Selenium");
        driver.findElementByName("btnK").click();
        System.out.println(driver.getTitle());
        driver.quit();
    }
}