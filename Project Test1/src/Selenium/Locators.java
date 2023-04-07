package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Locators {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.facebook.com/reg/");
//		driver.get("https://www.linkedin.com/login");
		
//		driver.findElement(By.tagName("input")).sendKeys("jignesh10172gmail.com"); // UN
		
//		driver.findElement(By.tagName("input")).sendKeys("8989562365"); // PW
		
//		ID Locator
		
//		driver.findElement(By.id("email")).sendKeys("Jignesh1017@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.id("pass")).sendKeys("9970316589");
		
		// Classname & Name Locator
		
//		driver.findElement(By.name("firstname")).sendKeys("Rakesh");
		
		driver.findElement(By.className("inputtext")).sendKeys("Jignesh"); //show error
		
		//Link-Text
		
//		driver.findElement(By.linkText("Developers")).click();
//		driver.findElement(By.partialLinkText("uploading")).click();
		
	}
	

}
