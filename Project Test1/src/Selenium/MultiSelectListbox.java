package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class MultiSelectListbox {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://mdbootstrap.com/docs/standard/extended/multiselect/");
		
		WebElement Multi = driver.findElement(By.xpath("(//div[@class='select-option selected'])[1]"));
		
		Select s = new Select(Multi);
		
		s.selectByIndex(1);
		s.selectByIndex(2);
		s.selectByIndex(3);
		
		List<WebElement> allOptions = s.getAllSelectedOptions();

		for(int i = 0; i<=allOptions.size()-1; i++) {
			System.out.println(allOptions.get(i).getText());
		}
	}

}
