package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MockPlus_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Oracal\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://user.mockplus.com/signin?next=https%3A%2F%2Fwww.mockplus.com%2Fblog%2Fpost%2Flogin-page-examples&source=");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jignesh1017@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("9975486215");
//		Thread.sleep(2000);
		WebElement enable = driver.findElement(By.xpath("//div[@class='submit']"));
		
		boolean result = enable.isEnabled();
		
		System.out.println(result);
	}

}
