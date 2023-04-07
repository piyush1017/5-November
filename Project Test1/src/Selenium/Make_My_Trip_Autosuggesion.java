package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Make_My_Trip_Autosuggesion {
	
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.makemytrip.com/");
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("//span[text()='From']")).click();
		
		driver.findElement(By.xpath("//input[@aria-autocomplete='list']")).sendKeys("pune");
		
		List<WebElement> options = driver.findElements(By.xpath("//div [@role='listbox']"));
		
		 

	for(int i=0;i<options.size();i++) {
		System.out.println(options.get(i).getText());
		 }

		 driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[2]")).click();

//		 driver.findElement(By.xpath("//p[text()='Pune, India']")).click();
	}

}
