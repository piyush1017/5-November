package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SingleSelectable {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
//		driver.get("https://www.facebook.com/login/");
		driver.get("https://www.facebook.com/reg/");
		
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
//		System.out.println(Year.getText()); // Normal get text method
		
						// validation proper nahi hoga
						// Organization me niche wala chalta he proper validation ke liye
		
		
		Select s = new Select(Month);
		
//		s.selectByValue("5"); // to print the specific year or month
		
//		s.deselectByValue("5");
		
		// For First Selected
//		System.out.println(s.getFirstSelectedOption().getText());
		// 1st selected show karta he
		
		
		
		// For all selected
//		List<WebElement> allOptions = s.getAllSelectedOptions();
//		
//		for(int i = 0; i<=allOptions.size()-1; i++) {
//			System.out.println(allOptions.get(i).getText());
//		}
		
		
		List<WebElement> option = s.getOptions(); // To get size of List Box
//		
//		//List of webElement return type he , x,y,z return karega (multiple)
//		// Web Element = web page ka 1 single element he.
//		
		int size = option.size();
//		
		System.out.println(size);
//		
//		// To print all the options present in listbox
//		
		for(int i = 0; i<=option.size()-1; i++) {
			System.out.println(option.get(i).getText());
			
			// pahele value leni he uske bad uska text print karna he
			
			// get index list ki method he
			
			//option.size() = 119
			//option.size()-1 = 118 (i=0 liya he isliye)
		}
		
		
		
		
		
		
		
		
		
		
	}

}
