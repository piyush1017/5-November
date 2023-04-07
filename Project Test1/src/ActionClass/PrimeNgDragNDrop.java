package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class PrimeNgDragNDrop {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://codepen.io/ovvn/full/Nqxzjg");
		
		driver.manage().window().maximize();
		
		WebElement iframe = driver.findElement(By.xpath("//iframe[@id='result']"));
		
		driver.switchTo().frame(iframe);
		
		Thread.sleep(2000);
		
		WebElement source = driver.findElement(By.xpath("(//a[@class='btn btn-default'])[1]"));
//		Thread.sleep(2000);
		WebElement destination = driver.findElement(By.xpath("//div[@id='dropzone']"));
		
		Actions act = new Actions(driver);
		
		Thread.sleep(3000);
		
//		act.moveToElement(source).clickAndHold().moveToElement(destination).release().build().perform();
		
		act.dragAndDrop(source, destination).perform();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//button[@type='button']")).click();
	}
}
