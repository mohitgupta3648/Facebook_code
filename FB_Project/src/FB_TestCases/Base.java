package FB_TestCases;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

import FB_Helper.TakeScreenshot;


public class Base {

    File f = new File("D:\\Home_Work_Space\\FB_Project\\OR.properties");
    FileReader fr = new FileReader(f);
    Properties pr = new Properties();

    WebDriver driver;
    Actions action;
    Alert alert;

    public Base() throws IOException {
        try {
            System.out.println("ff Browser lunch");
            //System.setProperty("webdriver.chrome.driver","C:\\Users\\Umendra\\Desktop\\chromedriver.exe");
            driver = new FirefoxDriver();
            //driver  = new ChromeDriver();
            driver.navigate().to("https://www.facebook.com");
            driver.manage().window().maximize();
        } catch (Exception e) {
            TakeScreenshot.takescreenshot(driver);
        }

    }
}