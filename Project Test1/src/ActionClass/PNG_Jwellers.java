package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PNG_Jwellers {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.pngjewellers.com/");
		
//		Thread.sleep(2000);
		
		WebElement account = driver.findElement(By.xpath("(//span[text()='Account'])[2]"));
		
//		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(account).perform();
		
		WebElement signupPage = driver.findElement(By.xpath("(//a[@section='signup'])[1]"));
	
		act.click(signupPage).perform();
		
		driver.findElement(By.xpath("//input[@name='userFirstName']")).sendKeys("Rahul");
		driver.findElement(By.xpath("//input[@name='userLastName']")).sendKeys("Patil");
		driver.findElement(By.xpath("//input[@name='userEmail']")).sendKeys("RP@10gmail.com");
		driver.findElement(By.xpath("//input[@name='userPassword']")).sendKeys("Rahul#1017");
		driver.findElement(By.xpath("//input[@name='userConfirmPassword']")).sendKeys("Rahul#1017");
		driver.findElement(By.xpath("//input[@name='userPhone']")).sendKeys("8888888888");
		
		WebElement checkbox = driver.findElement(By.xpath("//input[@class='pos-abs chkbx1']"));
		act.click(checkbox).perform();
		
		driver.findElement(By.xpath("//input[@name='submit']")).click();
		
		Thread.sleep(2000);
		
		WebElement account1 = driver.findElement(By.xpath("(//span[text()='Account'])[2]"));
		
		
//		Actions act1 = new Actions(driver); // nahi liya to bhi chalega
		
		act.moveToElement(account1).perform();
		
		driver.findElement(By.xpath("(//a[text()='Log in'])[1]")).click();
		
		driver.findElement(By.xpath("//input[@name='userLoginEmail']")).sendKeys("RP@10gmail.com");
		driver.findElement(By.xpath("//input[@name='userLoginPassword']")).sendKeys("Rahul#1017");
		
		driver.findElement(By.xpath("//input[@name='submitLogin']")).click();
	}

}
