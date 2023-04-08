package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox {

	public static void main(String[] args) {
	
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement Month = driver.findElement(By.xpath("//select[@title='Month']"));
		Select s = new Select(Month);
		//s.selectByIndex(7);
		System.out.println(s.getFirstSelectedOption().getText());

	}

	}


