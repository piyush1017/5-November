package TableAndScrollUp;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class New_Method_Table {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		Thread.sleep(2000);
		
		List<WebElement> noOfRows = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
//		WebElement noOfCell = driver.findElement(By.xpath("//table[@id='customers']//tr[5]//td[3]"));
		
		List<WebElement> tblColumn = driver.findElements(By.xpath("//table[@id='customers']//th"));
		
		for(int i =2 ; i<=noOfRows.size(); i++) {
			
			for(int cell =1; cell<=tblColumn.size();cell++) {
				
				WebElement noOfCell2 = driver.findElement(By.xpath("//table[@id='customers']//tr["+i+"]//td["+cell+"]"));
				System.out.print(noOfCell2.getText()+ "  ");
			}
			System.out.println();
			
//			System.out.println(noOfCell.size());
			
		}
	}

}
