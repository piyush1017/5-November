package Example_Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Video_Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.popup.store/");
		
		WebElement IF = driver.findElement(By.xpath("//iframe[@class='embedly-embed']"));
		
		driver.switchTo().frame(IF);
		
//		Thread.sleep(5000);
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='player']"));
		
		driver.switchTo().frame(iframe);
//		Thread.sleep(5000);
		driver.findElement(By.xpath("//div[@class='vp-preview']")).click();
	}

}
