package IFrame;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Dezlearn_Multiple_Iframe {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		
		driver.manage().window().maximize();
		
		Thread.sleep(3000);
		
		WebElement iframe1 = driver.findElement(By.xpath("//iframe[@id='parent_iframe']"));
		
		driver.switchTo().frame(iframe1);
		
		driver.findElement(By.xpath("//button[@id='u_5_5']")).click();
		
		WebElement iframe2 = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		
		driver.switchTo().frame(iframe2);
		
		driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();

}
}