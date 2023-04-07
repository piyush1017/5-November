package TableAndScrollUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap_table {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
//		https://ultimateqa.com/dummy-automation-websites/
//		https://mdbootstrap.com/docs/b4/jquery/tables/scroll/
//		https://onepagelove.com/inspiration
		driver.get("https://mdbootstrap.com/docs/b4/jquery/tables/scroll/");
		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		
		scroll.executeScript("window.scrollBy(0,1500)"); // scroll up
		
		Thread.sleep(4000);
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@role='grid']//tr"));
//		System.out.println(noOfRows.size());
		
		for(int i =0 ; i<=noOfRows.size(); i++) {
		List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@role='grid']//tr["+(i+1)+"]//td"));
		for(int cell =0; cell<=noOfCell.size()-1;cell++) {
			System.out.print(noOfCell.get(cell).getText()+ "   ");
		}
		System.out.println();
		
//		System.out.println(noOfCell.size());
		
		}
	}

}
