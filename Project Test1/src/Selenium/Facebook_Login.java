package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook_Login {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.facebook.com/reg/");
		
//		Thread.sleep(2000);
//		
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jignesh17@gmail.com");
//		Thread.sleep(5000);
//		driver.findElement(By.xpath("//input[@type='text']")).clear();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("jignesh17@gmail.com");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("jigs@12");
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("//a[text()='Already have an account?']")).click();
//		driver.findElement(By.xpath("//a[contains(text(),'non-users')]")).click();
				// for x path by text and contains
		
		driver.findElement(By.xpath("(//input[@name='firstname'])")).sendKeys("Sweta");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'lastname')]")).sendKeys("Patil");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[contains(@name,'reg_email__')]")).sendKeys("8888888888");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//input[@type='text'])[4]")).sendKeys("9970319886");
//		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[contains(@type,'password')]")).sendKeys("Sw@1017");
		Thread.sleep(2000);
		
//		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		Thread.sleep(2000);
		
		
		WebElement Date = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select s = new Select(Date);
		
		s.selectByValue("22"); // jo value degi vo ayegi 
		
		Thread.sleep(2000);
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select x = new Select(Month);
		
		x.selectByVisibleText("Mar");
		
		Thread.sleep(2000);
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select y = new Select(Year);
		
		y.selectByValue("2000");
//		y.selectByIndex(1);
		
		
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		boolean result1 = male.isSelected(); // o/p dega console me
		System.out.println(result1);
		Thread.sleep(2000);
		
//		WebElement enable = driver.findElement(By.xpath("//button[@name='websubmit']"));
//		
//		boolean result = enable.isEnabled();
//		
//		System.out.println(result);
		 
		driver.findElement(By.xpath("(//button[contains(@type,'submit')])[1]")).click();
//		Thread.sleep(2000);
		
		
		
		
		
		
		
		
	}

}
//input[@type='text']
//WebElement v = driver.findElement(By.xpath("//input[@type='password']"));