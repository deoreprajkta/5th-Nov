package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("WebDriver.chrome.driver", "C:\\Users\\praju\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.Facebook.com/");
		
		Thread.sleep(5000);
		driver.close();
		//driver.quit();
		
		//String title = driver.getTitle();
		//System.out.println(title);
		
		//String exptitle = "Online Shopping Site for Mobiles, Electronics,Furnitures" ;
		//if(title.equalsIgnoreCase(exptitle)) {
			System.out.println("Navigate to correct page");
		}
		//else {
			//System.out.println("Navigate to invalid page");
		
		
		
		
		

	}


