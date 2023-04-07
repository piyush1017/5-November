package TableAndScrollUp;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.album.alexflueras.ro/index.php/");
		
		Thread.sleep(2000);
		
//		driver.manage().window().maximize();
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,300)"); // scroll up
		Thread.sleep(1000);
		scroll.executeScript("window.scrollBy(0,-300)"); // scroll down
		Thread.sleep(1000);
		scroll.executeScript("window.scrollBy(5000,0)"); // scroll right
		Thread.sleep(1000);
		scroll.executeScript("window.scrollBy(-5000,0)"); // scroll left
	}

}
