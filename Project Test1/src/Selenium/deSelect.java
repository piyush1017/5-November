package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class deSelect {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
		driver.findElement(By.xpath("(//input[@role='listbox'])[1]")).click();
		
		WebElement Month = driver.findElement(By.xpath("(//div[@class='select-option'])[2]"));
		
		Select s = new Select(Month);
		
		s.selectByValue("2");
//		
//		s.deselectByValue("5");
		
		List<WebElement> allOptions = s.getAllSelectedOptions();
//		
		for(int i = 0; i<=allOptions.size()-1; i++) {
			System.out.println(allOptions.get(i).getText());
		}
	}

}
