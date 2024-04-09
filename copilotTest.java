import io.github.bonigarcia.wdm.WebDriverManager;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
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

    /* write a new method which reads data from xlsx file using Apache POI and prints the data */
    @Test
    public void readExcelData() throws IOException {
        FileInputStream fis = new FileInputStream("./data/data.xlsx");
        XSSFWorkbook workbook = new XSSFWorkbook(fis);
        XSSFSheet sheet = workbook.getSheetAt(0);
        for (int i = 0; i <= sheet.getLastRowNum(); i++) {
            System.out.println(sheet.getRow(i).getCell(0));
        }
        workbook.close();
    }

    /*write a new method to read data from a json file and print the data */
    @Test
    public void readJsonData() throws IOException {
        FileInputStream fis = new FileInputStream("./data/data.json");
        //get the file data
        byte[] data = new byte[fis.available()];
        fis.read(data);
        //print data
        System.out.println(new String(data));
    }
}