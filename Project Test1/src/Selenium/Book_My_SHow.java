package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Book_My_SHow {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Oracal\\chromedriver_win32\\chromedriver.exe");
		
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://lk.bookmyshow.com/secure/user-login");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//input[@placeholder='Continue with your mobile number.'])[1]")).sendKeys("886644789");
		Thread.sleep(2000);
		WebElement enable = driver.findElement(By.xpath("//a[@id='loginIntiate']"));
//		enable.click();
		boolean result = enable.isEnabled();
		
		System.out.println(result);
	}

}
