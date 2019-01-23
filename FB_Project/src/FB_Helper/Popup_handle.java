package FB_Helper;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;

public class Popup_handle {

    static WebDriver driver;

    public static void WebBased_PopUp_Aceept() {

        Alert alert = driver.switchTo().alert();
        alert.accept();
    }

    public static void WebBased_PopUp_Dismiss() {
        Alert alert = driver.switchTo().alert();
        alert.dismiss();
    }

}