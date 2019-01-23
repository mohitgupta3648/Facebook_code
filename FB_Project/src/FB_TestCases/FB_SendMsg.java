package FB_TestCases;


import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import FB_Helper.TakeScreenshot;
import FB_POM.FB_Login;


public class FB_SendMsg extends Base {


    public FB_SendMsg() throws InterruptedException, IOException {
        try {
            System.out.println("Entered in SendMsg menthod");
            FB_Login.Login(driver, pr, fr, "Enter Your Name", "userpasss");
            pr.load(fr);
            driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
            driver.findElement(By.xpath(pr.getProperty("click_on_profile_icon_xpath"))).click();
            driver.findElement(By.className(pr.getProperty("click_on_friend_list_button_classname"))).click();
            driver.findElement(By.cssSelector(pr.getProperty("click_on_search_added_textbox_cssselector"))).sendKeys("umender");
            Thread.sleep(2000);
            driver.findElement(By.cssSelector(pr.getProperty("click_on_after_search_friend_cssselector"))).click();
            Thread.sleep(2000);
            driver.findElement(By.linkText(pr.getProperty("message_button_linktag"))).click();
            /*Thread.sleep(2000);
            List < WebElement > DataCount;
            DataCount = driver.findElements(By.cssSelector("div[class='_1mf _1mj']"));
            System.out.println(DataCount.size());*/
            Thread.sleep(2000);
            driver.findElement(By.xpath(".//*[@id='js_2g7']/div[5]/div/div[1]/div/div/div[2]/div/div/div/div")).sendKeys("hihi");
            System.out.println("after enter text");
        } catch (Exception e) {
            System.out.println("Enterd in catch block");
            TakeScreenshot.takescreenshot(driver);
        }


    }

    @Test
    public void tc() throws InterruptedException, IOException
    {
    	FB_SendMsg f=new FB_SendMsg();
    }
}