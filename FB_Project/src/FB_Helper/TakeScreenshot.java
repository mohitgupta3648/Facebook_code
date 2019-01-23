package FB_Helper;

import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;


public class TakeScreenshot {
	static DateFormat dateFormat = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");
	 
	 //get current date time with Date()
	 static Date date = new Date();
	 
	 // Now format the date
	 static String date1= dateFormat.format(date);
	 static String FilePatch = "D:\\Home_Work_Space\\FB_Project\\Screenshots\\";
	 static String FileName = "Snapshot"+ date1+".png";

	
    public static void takescreenshot(WebDriver driver) throws IOException {
    	
    	 System.out.println("Current date and time is " +date1);
    	    
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        //FileUtils.copyFile(src, new File(FilePatch+""+FileName));
        FileUtils.copyFile(src, new File("D:\\Home_Work_Space\\FB_Project\\Screenshots\\screenshot.png"));
    }

}