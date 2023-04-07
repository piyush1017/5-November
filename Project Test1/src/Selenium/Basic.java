package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver","C:\\Oracal\\chromedriver_win32\\chromedriver.exe");
		
		// exe file location me ja ke vaha se browser pe launch karta he
		
		WebDriver driver = new ChromeDriver();// upcasting
		
		driver.get("https://www.facebook.com/");
//		driver.get("https://www.flipkart.com/");
		
		
//		Thread.sleep(3000); // mili second me time dete he, 1 sec = 1000 mili second
		// 3 sec ke liye puase kar raha he
		// inttereupted exception ane vala tha usko throw kr diya (fek dega)
		
//		driver.close(); // current tab close

//		driver.quit(); // current browser close
		
		String title = driver.getTitle();
		
		System.out.println(title);
//		
//		String expTitle = "Online Shopping Site for Mobiles, Electronics, Furniture, Grocery, Lifestyle, Books & More. Best Offers!";
//		
//		if(title.equalsIgnoreCase(expTitle)) {
//			System.out.println("Navigate to correct page");
//		}
//		else {
//			System.out.println("Navigate to invalid page");
//		}
		
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.instagram.com/");
//		
		
////		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.amazon.in/");
//		Thread.sleep(3000);
//		driver.close();	// Current open browser close
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.instagram.com/");
//		driver.quit();
		
//		String url = driver.getCurrentUrl();
//		
//		System.out.println(url);
//		
//		String expUrl = "https://www.flipkart.com/";
////		
//		if(url.equalsIgnoreCase(expUrl)) {
//			System.out.println("Navigate to correct page");
//		}
//		else {
//			System.out.println("Navigate to invalid page");
//		}
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.manage().window().minimize();
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
		
//		Thread.sleep(5000);
//		driver.navigate().to("https://www.facebook.com/");
//		Thread.sleep(5000);
//		driver.navigate().back(); // empty page
//		Thread.sleep(5000);
//		driver.navigate().forward();
//		Thread.sleep(5000);
//		driver.navigate().refresh();
//		Thread.sleep(3000);
//		driver.manage().window().maximize();
//		Thread.sleep(3000);
//		driver.close();
		
//		Thread.sleep(3000);
//		Dimension d = new Dimension(400,600); // size in pixcel.
//		// constructor me arguments pass ki he
//		driver.manage().window().setSize(d);	
//		Thread.sleep(3000);
//		Point p = new  Point(200,400);
//		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
	
		
		
		
		
		
		
		
		

	}

}
