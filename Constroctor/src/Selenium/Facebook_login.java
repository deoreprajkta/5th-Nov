package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Facebook_login {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		WebDriver driver = new FirefoxDriver();
		driver.get("https://www.facebook.com/login.php/");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prajktadeore11@gmail.com");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("praju@321");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@value='1']")).click();
		
		
	}
	

}
