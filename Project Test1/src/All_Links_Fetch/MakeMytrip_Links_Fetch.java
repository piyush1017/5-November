package All_Links_Fetch;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class MakeMytrip_Links_Fetch {
	
	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		
		Thread.sleep(2000);
		
		List<WebElement> links = driver.findElements(By.xpath("//a"));
		
		System.out.println(links.size()); // show 330 but print 325
		
		for(int i = 0; i<links.size(); i++) {
			
			System.out.println(links.get(i).getText() + ":" + links.get(i).getAttribute("href"));
		}
	}

}
