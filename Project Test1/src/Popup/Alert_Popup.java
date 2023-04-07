package Popup;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[2]")).click();
		
//		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-primary']")).click();
		
//		Thread.sleep(1000);
		
//		(//a[@class='analystic'])[2]
		
		driver.switchTo().alert().accept();
	}

}
