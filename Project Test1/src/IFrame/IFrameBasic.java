package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IFrameBasic {
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_myfirst");
		
//		driver.findElement(By.xpath("//butt0on[@type='button']")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe); //change Selenium focus from main page to iframe
		
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
		driver.switchTo().defaultContent(); // Sel focused change to main page
		
//		driver.switchTo().parentFrame();
		
		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}

}
