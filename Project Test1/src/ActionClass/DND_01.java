package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DND_01 {
	
public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://codepen.io/acauamontiel/full/NPBWyM");
		
//		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='result']"));
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(5000);
		
		WebElement source = driver.findElement(By.xpath("//div[text()='A']"));
//		Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("//div[text()='L']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(2000);
		
//		act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		act.dragAndDrop(source, destination).perform();
		
	}

}
