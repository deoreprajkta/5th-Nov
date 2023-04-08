package WebTable;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollUpDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		driver.manage().window().maximize();
		JavascriptExecutor scroll = (JavascriptExecutor)driver;
		scroll.executeScript("window.scrollBy(0,700)"); //up
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(0,-700)"); //down
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(500,0)"); //right
		Thread.sleep(3000);
		scroll.executeScript("window.scrollBy(-500,0)"); //left
		Thread.sleep(3000);

	}

}
