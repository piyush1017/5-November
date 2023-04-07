package Selenium;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;


public class Selenium_Practice {
	
	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver","C:\\Oracal\\chromedriver_win32\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/login/");
//		driver.get("https://www.flipkart.com/");
//		driver.get("https://www.instagram.com/");
//		driver.get("https://www.amazon.in/");
		
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		
		System.out.println(title);
		
		String expTitle = "Log in to Facebook";
		
		if(title.equalsIgnoreCase(expTitle)) {
			System.out.println("correct Page");
		}
		else {
			System.out.println("Incorrect page");
		}
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.instagram.com/");
		
//		Thread.sleep(2000);
		
//		driver.switchTo().newWindow(WindowType.TAB);
//		driver.get("https://www.flipkart.com/");
		
//		Thread.sleep(2000);		
		
//		driver.close();
			
//		driver.switchTo().newWindow(WindowType.WINDOW);
//		driver.get("https://www.amazon.in/");
		
//		Thread.sleep(3000);
		
//		driver.quit();
		
		String url = driver.getCurrentUrl();
		
		System.out.println(url);
		
		String expUrl = "https://www.facebook.com/login/";
		
		if(url.equalsIgnoreCase(expUrl)) {
			System.out.println("correct URL");
		}
		else {
			System.out.println("Incorrect URL");
		}
		
//		driver.navigate().to("https://www.instagram.com/");
		
//		driver.navigate().back();
//		
//		Thread.sleep(2000);
//		
//		driver.navigate().forward();
//		
//		Thread.sleep(3000);
//		
//		driver.navigate().refresh();
		
		
//		Dimension d = new Dimension(400,600);
//		
//		driver.manage().window().setSize(d);
//		Thread.sleep(2000);
//		
//		Point p = new Point(200,400);
//		driver.manage().window().setPosition(p);
		
		System.out.println(driver.manage().window().getSize());
		
		driver.manage().window().maximize();
		
		System.out.println(driver.manage().window().getSize());
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}
	

}
