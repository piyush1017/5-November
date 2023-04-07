package Practice;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test {
	
	int a =15;
	static int b =10;
	
	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://trends.builtwith.com/websitelist/Responsive-Tables");
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@style='font-size: 0.85em']//tr"));
		
		for(int i=0; i<=rows.size()-1; i++) {
			
			List<WebElement> cells = driver.findElements(By.xpath("//table[@style='font-size: 0.85em']//tr["+ (i+1) +"]//td"));
			
			for(int cell=0; cell<=cells.size()-1; cell++) {
				System.out.print(cells.get(cell).getText()+ "  ");
			}
			System.out.println();
		}
		
	}

}
