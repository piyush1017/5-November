package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsSelected {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
//		WebElement female = driver.findElement(By.xpath("(//input[@type='radio'])[1]"));
		// click directly bhi le sakte he,female variable me store kiya he
		// customize kiya he
		
//		female.click();
		// isiliye female.click liya he
		
//		boolean result = female.isSelected(); // o/p dega console me
		// result name ka variable he , always in small letter
		// isselected o/p boolean me degi true or false
		
//		System.out.println(result);
		
		WebElement male = driver.findElement(By.xpath("(//input[@type='radio'])[2]"));
		male.click();
		boolean result1 = male.isSelected(); // o/p dega console me
		System.out.println(result1);
		
		if(result1 == true) { // validate kiya he sach me ho raha he ya nahi
			System.out.println("Given element is selected");
		}
		else {
			System.out.println("Given element is not selected");
		}
	}

}
