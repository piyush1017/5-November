package IFrame;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Iframe_Practice {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		driver.get("https://www.dezlearn.com/nested-iframes-example/");
		
		driver.manage().window().maximize();
		
		WebElement IF = driver.findElement(By.xpath("//iframe[@id='parent_iframe']"));
		
		driver.switchTo().frame(IF);
		
//		driver.findElement(By.xpath("//button[@id='u_5_5']")).click();
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@id='u_5_5']"))).click();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='iframe1']"));
		
		driver.switchTo().frame(iframe);
		
		driver.findElement(By.xpath("//button[@id='u_5_6']")).click();
		
		driver.switchTo().defaultContent();
		
		driver.findElement(By.xpath("//a[text()='Home']")).click();
		
			
	}

}
