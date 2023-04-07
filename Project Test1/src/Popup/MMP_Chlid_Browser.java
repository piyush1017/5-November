package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class MMP_Chlid_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("(//span[text()='View All']")).click();
		
		Set<String> id = driver.getWindowHandles();
		
		ArrayList<String> al = new ArrayList<String>(id);
		
		String CB = al.get(1);
		
		driver.switchTo().window(CB);
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//a[@class='primaryBtn link'])[3]")).click();
	}

}
