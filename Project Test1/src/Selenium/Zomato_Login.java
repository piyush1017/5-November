package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Zomato_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://zoom.us/signin#/login");
		
//		driver.get("https://www.zomato.com/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jignesh1017@gmail.com");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("88667792");
		driver.findElement(By.xpath("//button[@type='button']")).click();
		
//		driver.findElement(By.xpath("input[@type='number']")).sendKeys("9970319886");
//		driver.findElement(By.xpath("//button[@role='button']")).click();
	}

}
