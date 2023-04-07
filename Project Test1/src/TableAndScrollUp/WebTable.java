package TableAndScrollUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTable {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(2000);
		
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
//		System.out.println(noOfRows.size());
		
		for(int i =1 ; i<noOfRows.size(); i++) {
			
		List<WebElement> noOfCell = driver.findElements(By.xpath("//table[@id='customers']//tr["+(i+1)+"]//td"));
		
		for(int cell =0; cell<noOfCell.size();cell++) {
			
			System.out.print(noOfCell.get(cell).getText()+ " ");
		}
		System.out.println();
		
//		System.out.println(noOfCell.size());
		
		}
		
		// Have to change in <= in for loop 
		
	}

}
