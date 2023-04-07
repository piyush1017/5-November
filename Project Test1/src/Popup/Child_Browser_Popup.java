package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Child_Browser_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(id);
		
		String CB = al.get(1);
		
		driver.switchTo().window(CB);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Watch free courses']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='Videos']")).click();
		
		Thread.sleep(2000);
		
		driver.switchTo().window(al.get(0));
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@name='NewTab']")).click();
//		Thread.sleep(2000);
//		driver.switchTo().window(al.get(1));
		
		
//		driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
		
		
	}

}
