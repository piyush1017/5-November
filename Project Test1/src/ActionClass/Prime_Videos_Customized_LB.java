package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Prime_Videos_Customized_LB {
	
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.primevideo.com/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(2000);
		
		WebElement login = driver.findElement(By.xpath("(//a[@tabindex='0'])[1]"));
		
		Thread.sleep(2000);
		
		Actions act = new Actions(driver);
		
		act.moveToElement(login).perform(); // Moving angular brace to login element
		
		Thread.sleep(2000);
		WebElement orders = driver.findElement(By.xpath("(//a[text()='Amazon Originals'])[2]"));
		
		act.click(orders).perform();
	}

}
