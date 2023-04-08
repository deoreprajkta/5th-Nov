package ActionClass;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;

//import java.util.List;

//import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebElement {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		Thread.sleep(2000);
		
	
		java.util.List<org.openqa.selenium.WebElement> noOfROws = driver.findElements(By.xpath("//table[@id='customers']//tr"));
		
		System.out.println(noOfROws.size());
		
		
		 
	
		
		

	}

}
