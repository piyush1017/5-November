package All_Links_Fetch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class onlinesbi_Links_Fetch {
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.onlinesbi.sbi/");
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size()); // 193 print 188
		
		for(int i = 0; i<links.size(); i++) {
			
			System.out.println(links.get(i).getText() + ":" + links.get(i).getAttribute("href"));
		}
	}

}
