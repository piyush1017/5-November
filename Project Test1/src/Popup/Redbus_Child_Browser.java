package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Redbus_Child_Browser {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
//		driver.get("https://skpatro.github.io/demo/links/");
		
		driver.manage().window().maximize();
		
		driver.get("https://www.redbus.in/bus-tickets");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("(//img[@width='273'])[1]")).click();
		driver.findElement(By.xpath("(//img[@width='273'])[2]")).click();
		driver.findElement(By.xpath("(//img[@width='273'])[3]")).click();
		Thread.sleep(3000);
		
		Set<String> id = driver.getWindowHandles();
		ArrayList<String> al = new ArrayList<String>(id);
		
		driver.switchTo().window(al.get(3));
		driver.switchTo().window(al.get(2));
		driver.switchTo().window(al.get(1));
		driver.switchTo().window(al.get(0));

	}

}
