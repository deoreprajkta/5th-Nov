package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Locatorsmnth {


	public static void main(String[] args) throws InterruptedException {
		
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
	 WebElement  Month = driver.findElement(By.xpath("//select[@title='Month']"));
		
		Select s = new Select(Month);
		
		s.selectByValue("8");
		//Thread.sleep(1000);
		
		//WebElement Date = driver.findElement(By.id("//select[@id='day']"));
		//Select a = new Select(Date);
		//a.selectByIndex(3);
		
		

	}

}
