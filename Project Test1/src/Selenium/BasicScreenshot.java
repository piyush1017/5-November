package Selenium;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class BasicScreenshot {
	
	public static void main(String[] args) throws IOException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.facebook.com/login/");
//		driver.get("https://www.facebook.com/reg/");
		
		for(int i =1; i<=5; i++) {
		  File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		  // ye line ss captured kar ke de raha he
		  
		  
		  File destination = new File("C:\\Users\\Dell\\Pictures\\SCREENSHOT\\Test123"+i+".jpg");
		  // concatination use kiya he multiple ss ke liye and name change ke liye
		  // i se iteration hoga
		  // path de raha he kaha store hoga vo yaha pe
		  // yaha pe file ka object create hua he
		  
		  FileHandler.copy(source, destination);
		  // file handler name ke class ka use kar ke copy paste karege
		 // file from , file to dikhega.  
		 
		}
	}

}
