package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotDateTime {
	
		
		public static void Screenshot1() throws IOException {
			
			WebDriver driver = new ChromeDriver();// upcasting
			
			driver.get("https://www.facebook.com/reg/");
			
	        File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	        
	        String fileName =  new SimpleDateFormat("dd-MM-yyyy_hh-mm-ss").format(new Date());

	        File destination = new File("C:\\Users\\Dell\\Pictures\\SCREENSHOT\\Velosity"+ " " + fileName +".jpg");		  
			  FileHandler.copy(source, destination);
			  
			}
		
		public static void main(String[] args) throws IOException {
			ScreenshotDateTime.Screenshot1();
			
		}	
		
}
