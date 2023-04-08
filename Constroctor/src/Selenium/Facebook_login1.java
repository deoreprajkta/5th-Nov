package Selenium;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Facebook_login1 {
	public static void main(String[]args)  {
		WebDriver driver = new ChromeDriver();
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		driver.get("https://www.facebook.com/login");
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prajktadeore11@gmail.com");
		//Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@type='text']")).clear();
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("prajudeore");
		//Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("praju@123");
		//Thread.sleep(2000);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//button[@value='1']")));
		driver.findElement(By.xpath("//button[@value='1']")).click();
	}

}
