package ActionClass;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class customizedListBox {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver",C:\\Users\\praju\\Downloads\\chromedriver_win32\\chromedriver.exe/");

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@class='_2KpZ61_2doB4z']"));
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.xpath("//a[@class='1_3w1N']"));
		Actions act = new Actions(driver);
		act.moveToElement(login).perform();
		
	}

}
