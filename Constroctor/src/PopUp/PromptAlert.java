package PopUp;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.get("https://nxtgenaiacademy.com/alertandpopup");
		Thread.sleep(2000);
		driver.findElement(By.xpath("(//button[@name='promptalertbox1234'])[1]")).click();
		Thread.sleep(2000);
		org.openqa.selenium.Alert Alt = driver.switchTo().alert();
		Alt.sendKeys("Yes");
		Thread.sleep(2000);
		Alt.accept();

	}

}
