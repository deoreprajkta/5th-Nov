package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListBox2 {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement Month = driver.findElement(By.xpath("//select[@title = 'Year']"));
		Select a = new Select(Month);
		//List<WebElement> allOptions = a.getAllSelectedOptions();
		//for(int i =0;i <=allOptions.size()-1;i++);
		//int i = 0;
		System.out.println(a.getFirstSelectedOption().getText());

	}

}
