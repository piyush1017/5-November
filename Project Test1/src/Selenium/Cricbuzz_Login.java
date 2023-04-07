package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cricbuzz_Login {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.cricbuzz.com/premium-subscription/user/login");
				
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("jignesh1017@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}

}
