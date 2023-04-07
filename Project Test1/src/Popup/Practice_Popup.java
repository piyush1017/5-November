package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Practice_Popup {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://skpatro.github.io/demo/links/");
		
		Thread.sleep(2000);
		
		WebElement tab = driver.findElement(By.xpath("//input[@name='NewTab']"));
		
		tab.click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(id);
		
		String CB = al.get(1);
		
		driver.switchTo().window(CB);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='Training'])[1]")).click();
		
//		String newTab = al.get(0);
		driver.switchTo().window(al.get(0));
		
		tab.click();
		
//		Set<String> id1 = driver.getWindowHandles();
//		
//		ArrayList<String> al1 = new ArrayList<String>(id1);
		
		String CB2 = al.get(2);
		
		Thread.sleep(2000);
		
		driver.switchTo().window(CB2);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//span[text()='WebdriverIO'])[1]")).click();
	}

}
