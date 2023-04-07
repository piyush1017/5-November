package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Popup_FB {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); 
		
		driver.get("https://www.amazon.in/pop-ups/s?k=pop+ups");
//		driver.get("https://www.flipkart.com/");
		
		Thread.sleep(3000);
//		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		driver.findElement(By.xpath("//a[@id='nav-hamburger-menu']")).click();
		
		driver.findElement(By.xpath("//div[@class='nav-sprite hmenu-close-icon']")).click();
	}

}
