package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Implicit_Explicit {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(20));
		
		driver.get("https://www.facebook.com/login.php");
//		driver.get("https://www.facebook.com/reg/");
		
		// driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS); // deprecated method
		// old method , not use now, we use below method
		
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.findElement(By.id("email")).sendKeys("Hari25@gmail.com");
		
		driver.findElement(By.id("pass")).sendKeys("1234567890");
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.id("loginbutton"))).click();
		
//		driver.findElement(By.id("loginbutton")).click();		
		
	}

}
