package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naukari_login {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.naukri.com/nlogin/login");
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@id='usernameField']")).sendKeys("jignesh1017@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='passwordField']")).sendKeys("88667792");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	}

}
