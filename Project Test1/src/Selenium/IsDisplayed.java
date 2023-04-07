package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IsDisplayed {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.facebook.com/reg/");
		
		driver.findElement(By.xpath("(//input[@type='radio'])[3]")).click();
		
		WebElement customGen = driver.findElement(By.xpath("//input[@name='custom_gender']"));
//		customGen.click();
		boolean result = customGen.isDisplayed();
		//IsDisplayed 
		// element present nahi he, hidden he, click karne ke bad hi dikhega
		// agar dusre element pe click karege to vo hide ho jana chahiye
		// perticular element pe hi show hona chahiye
		// Ex - Custom button.
		
		System.out.println(result);
		
		// getText Method
		
		WebElement text = driver.findElement(By.xpath("//div[@class='_8esf _8f3m _9bpz _9bq9']"));
		
		String result1 = text.getText();
		
		System.out.println(result1);
		
//		getAttribute Method
		
		WebElement ele = driver.findElement(By.xpath("//input[@id='password_step_input']"));
		
		String attribute = ele.getAttribute("name");
		
		System.out.println(attribute);
		
		
//		/html/body/select (absolute x path)
//		/html/body/div[1]/div[1]/div[1]/div[2]/div/div[2]/div/div/div[1]/form/div[1]/div[1]/div[1]/div[1]/div/div[1]/input

	}

}
