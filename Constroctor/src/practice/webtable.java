package practice;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class webtable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.guru99.com/test/drag_drop.html");
		List<WebElement> web = driver.findElements(By.xpath("//table[@border='1']"));
		web.size();
		for(WebElement als : web) {
			String value = als.getText();
			System.out.println(value);
		}

	}

}
