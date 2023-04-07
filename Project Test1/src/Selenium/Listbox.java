package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Listbox {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.facebook.com/reg/");
		
		WebElement Date = driver.findElement(By.xpath("//select[@title='Day']"));
		
		Select s = new Select(Date);
		
		// select class ki method kon se element pe perform karni he = date pe
		// to hum atgument me date de dege.
		
//		s.selectByIndex(7); // index se select karega, 1 kam kar ke dega
		
		s.selectByValue("22"); // jo value degi vo ayegi 
		
//		s.selectByVisibleText("Mar"); // ye sirf text ke liye use hoga date ke liye nahi
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select x = new Select(Month);
		
		x.selectByVisibleText("Mar");
		
		WebElement Year = driver.findElement(By.xpath("//select[@title='Year']"));
		
		Select y = new Select(Year);
		
//		y.selectByValue("2020");
		y.selectByIndex(1);
		
		// deSelect ki practice karne ki he , all select class methods try at home
	}
}
