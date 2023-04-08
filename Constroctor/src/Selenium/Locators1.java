package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;
import org.openqa.selenium.support.ui.Select;

public class Locators1 {


	

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		
	
	WebElement Date =	driver.findElement(By.xpath("//label[@for='u_0_4_w7']"));
		
		Select s = new Select(Date);
		s.selectByValue("5");

	}

}
