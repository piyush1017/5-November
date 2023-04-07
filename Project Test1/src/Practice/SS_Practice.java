package Practice;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class SS_Practice {
	
	public static void main(String[] args) throws IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/login/");
		
		File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		String filename = new SimpleDateFormat("dd-MM-YY_hh-mm-ss").format(new Date());
		
		File destination = new File("C:\\Users\\Dell\\Pictures\\SCREENSHOT\\Name"+filename+".jpg");
		
		FileHandler.copy(source, destination);
	}

}
