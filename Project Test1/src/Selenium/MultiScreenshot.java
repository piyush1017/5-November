package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class MultiScreenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.facebook.com/reg/");
		
		for(int i =1; i<=5; i++) {
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  
		  String random = RandomString.make(4);
		  
		  File destination = new File("C:\\Users\\Dell\\Pictures\\SCREENSHOT\\Test123"+ random +".jpg");
		  
		  FileHandler.copy(source, destination);
		   
		 
		}
	}

}
