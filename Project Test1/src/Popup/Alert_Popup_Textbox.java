package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alert_Popup_Textbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://demo.automationtesting.in/Alerts.html");
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("(//a[@class='analystic'])[3]")).click();
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//button[@class='btn btn-info']")).click();
		
		Thread.sleep(1000);
				
		driver.switchTo().alert().sendKeys("Automation");
		
		Thread.sleep(1000);
		
		driver.switchTo().alert().accept();
	}

}
//https://demoqa.com/alerts