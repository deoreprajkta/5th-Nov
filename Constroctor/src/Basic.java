import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic {

	public static void main(String[] args) {
		
		
		
		
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\praju\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver(); // upcasting
		driver.get("https://www.google.com/"); 
	}

	}


