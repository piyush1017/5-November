package Example_Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Programs_Practice {
	
	// Armstrong Number 371, 153, 370, 407, 1634, 8208, 9474
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.w3schools.com/tags/tryit.asp?filename=tryhtml_iframe");
		
//		driver.findElement(By.xpath("//butt0on[@type='button']")).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		
		driver.switchTo().frame(iframe); //change Selenium focus from main page to iframe
		
		driver.findElement(By.xpath("//a[@title='HTML video tutorial']")).click();
		
//		driver.switchTo().defaultContent(); // Sel focused change to main page
		
//		driver.switchTo().parentFrame();
		
//		driver.findElement(By.xpath("//a[@id='tryhome']")).click();
	}
	
}
//pre[contains(text(),'Hello World')]