package Selenium;

import java.awt.Dimension;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic5 {
	
	public static void main(String[]args) throws InterruptedException {
		
		System.setProperty("Webdriver.chrome.driver","C:\\Users\\praju\\Downloads\\chromedriver_win32\\chromedriver.exe");
				WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		Thread.sleep(5000);
		
		
		Dimension d = new Dimension(200,600);
		
		driver.manage().window().setPosition(null);
		
	}

}
