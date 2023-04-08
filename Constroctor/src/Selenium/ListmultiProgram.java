package Selenium;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class ListmultiProgram {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/signup");
		WebElement year = driver.findElement(By.xpath("//select[@id='year']"));
		Select s = new Select(year);
		
		List<WebElement> option = s.getOptions();
		int size = option.size();
		for(int i = 0;i<=option.size()-1;i++) {
		System.out.println(option.get(i).getText());

	}
		
	}

}
