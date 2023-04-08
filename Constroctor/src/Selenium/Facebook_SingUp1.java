package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Facebook_SingUp1 {
	
	
	public static void main(String[]args) throws InterruptedException {
		
		
	    WebDriver driver = new ChromeDriver();
	    
	    driver.get("https://www.facebook.com/signup");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Prajkta");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@name,'last')]")).sendKeys("Deore");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@name,'_email')]")).sendKeys("praju@123");
	    Thread.sleep(2000);
	    
	    driver.findElement(By.xpath("//input[contains(@type,'word')]")).sendKeys("prajuniket");

}
}