
package FB_POM;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import FB_Helper.TakeScreenshot;


public class FB_Login {

    public static void Login(WebDriver driver, Properties pr, FileReader fr, String user, String password) throws IOException {

        try {
            System.out.println("Entered in login menthod");
            pr.load(fr);
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
            WebElement user1 = driver.findElement(By.id(pr.getProperty("user_name_id")));
            user1.sendKeys(user);
            WebElement pass1 = driver.findElement(By.id(pr.getProperty("login_password_id")));
            pass1.sendKeys(password);
            driver.findElement(By.id(pr.getProperty("submit_button_id"))).click();
        } catch (Exception e) {
            TakeScreenshot.takescreenshot(driver);
        }

    }
}