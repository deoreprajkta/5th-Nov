package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_Singup {
	
	public static void main(String[]args) throws InterruptedException {
		
		
    WebDriver driver = new ChromeDriver();
    
    driver.get("https://www.facebook.com/signup");
    Thread.sleep(2000);
    
    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prajkta");
    Thread.sleep(2000);
    
    //driver.findElement(By.xpath("//input[@type='text']")).clear();
    //Thread.sleep(3000);
    
   // driver.findElement(By.xpath("//input[@type='text']")).sendKeys("praju@123");
   // Thread.sleep(3000);
   // driver.findElement(By.xpath("////input[@type='password']")).sendKeys("prajuniket");
    //Thread.sleep(3000);
    
    //driver.findElement(By.xpath("//button[@value='1']")).click();
   // Thread.sleep(3000);
    driver.findElement(By.xpath("//input[contains(@class,'_58mg')]")).sendKeys("Deore");
		
	}

}
