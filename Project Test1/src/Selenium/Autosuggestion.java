package Selenium;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Autosuggestion {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.amazon.in/");
		
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("samsung moblie");
		
		List<WebElement> opt = driver.findElements(By.xpath("//div[@class='autocomplete-results-container']"));
		
		for(int i=0; i<opt.size(); i++) {
			
			System.out.println(opt.get(i).getText());
		}
		
	}

}
