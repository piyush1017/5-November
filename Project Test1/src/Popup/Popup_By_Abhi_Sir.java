package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_By_Abhi_Sir {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://nxtgenaiacademy.com/alertandpopup/");
		
//		driver.findElement(By.xpath("//button[@name='alertbox']")).click();
		
//		driver.findElement(By.xpath("//button[@name='confirmalertbox']")).click();
		
		driver.findElement(By.xpath("//button[@name='promptalertbox1234']")).click();
		
		Thread.sleep(2000);
		
		Alert Al = driver.switchTo().alert();
		
		Al.sendKeys("Yes");
		
		Al.accept();
		
//		Al.dismiss();
	}

}
