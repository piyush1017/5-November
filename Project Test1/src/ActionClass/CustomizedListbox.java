package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class CustomizedListbox {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.flipkart.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@class='_2KpZ6l _2doB4z']")).click();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("//a[@class='_1_3w1N']"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login).perform(); // Moving angular brace to login element
		
		Thread.sleep(2000);
		WebElement orders = driver.findElement(By.xpath("(//a[@class='_2kxeIr _1pY_1Z'])[3]"));
		
		act.click(orders).perform();
		
//		https://www.pngjewellers.com/login/signup
		
		
	}

}
