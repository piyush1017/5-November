package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_Dropdown_Practice {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
//		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
		driver.get("https://demos.jquerymobile.com/1.4.5/checkboxradio-radio/");
		
		
//		WebElement name = driver.findElement(By.tagName("select"));
		
//		Select s = new Select(name);
		
//		s.selectByValue("Yahoo");
		
//		s.selectByIndex(2);
		
//		s.selectByVisibleText("Uganda");
		
		Thread.sleep(4000);
		
		WebElement three = driver.findElement(By.xpath("//label[@for='radio-choice-h-2c']"));
		three.click();
		
	}

}
