package ActionClass;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Practice_List {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://www.globalsqa.com/demo-site/select-dropdown-menu/");
		
//		https://www.htmlelements.com/demos/listbox/overview/
		
//		https://mdbootstrap.com/docs/b4/jquery/forms/date-picker/
		
		driver.manage().window().maximize();
		
		
		WebElement ebooks = driver.findElement(By.xpath("(//a[@class='no_border'])[2]"));
		
		
		Actions act = new Actions(driver);
		
		act.moveToElement(ebooks).perform();
		
		
		WebElement free = driver.findElement(By.xpath("(//span[text()='Demo Testing Site'])[1]"));
		
		act.moveToElement(free).perform();
		
		
		WebElement alert = driver.findElement(By.xpath("(//span[text()='AlertBox'])[1]"));
		act.click(alert).perform();
	}

}
