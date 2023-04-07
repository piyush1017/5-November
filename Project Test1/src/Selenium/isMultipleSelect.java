package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class isMultipleSelect {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.facebook.com/reg/");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		
		Select s = new Select(Month);
		
		boolean result = s.isMultiple();
		
		System.out.println(result);
		
		if(result == true) {
			System.out.println("Listbox is Multiselecteble");
		}
		else {
			System.out.println("Listbox is single selectale");
		}
	}

}
