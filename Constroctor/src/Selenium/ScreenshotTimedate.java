package Selenium;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

import net.bytebuddy.utility.RandomString;

public class ScreenshotTimedate {
	public static void main(String[]args) throws IOException {
		WebDriver driver = new FirefoxDriver();
		driver.get("https://in.linkedin.com/");
		
		for (int i=1;i<=3;i++)
		{
			File source = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			String random = RandomString.make(3);
			File destination = new File("C:\\Users\\praju\\OneDrive\\Documents\\Booksheet.xlsx");
			FileHandler.copy(source, destination);
	
		}
		}
	public static String timestamp() {
		return new SimpleDateFormat("YYYY-MM-DD HH-mm-ss").format(new Date());
		
	}

}
