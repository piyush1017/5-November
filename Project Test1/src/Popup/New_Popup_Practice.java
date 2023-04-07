package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Popup_Practice {

	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
			
		WebElement newTab = driver.findElement(By.xpath("//input[@name='NewTab']"));
		newTab.click();
		
		Set<String> res = driver.getWindowHandles();
		ArrayList<String> id = new ArrayList<String>(res);
		
		driver.switchTo().window(id.get(0));
		Thread.sleep(2000);
		newTab.click();
		driver.switchTo().window(id.get(0));
		Thread.sleep(2000);
		newTab.click();
		driver.switchTo().window(id.get(0));
		Thread.sleep(2000);
		newTab.click();
		
		Set<String> res1 = driver.getWindowHandles();
		ArrayList<String> id1 = new ArrayList<String>(res1);
		Thread.sleep(2000);
		driver.switchTo().window(id1.get(4));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		driver.switchTo().window(id1.get(2));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='Selenium'])[1]")).click();
		driver.switchTo().window(id1.get(3));
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
	}

}
