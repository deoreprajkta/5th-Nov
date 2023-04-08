package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class locators {
	
	
	

	public static void main(String[]args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/signup");
		
		WebElement Date = driver.findElement(By.xpath("//select[@title='Day']"));
		
		
		Select s = new Select(Date);
		
		s.selectByIndex(11);
		//s.selectBy
		
				
		
	}

}
