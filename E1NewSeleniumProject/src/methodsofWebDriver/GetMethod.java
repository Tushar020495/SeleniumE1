package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // to launch chrome browser. to import ctrl + space
		Thread.sleep(5000);   // stop execution 5 sec.
		driver.get("https://www.flipkart.com/");     // to close browser window.

	
	}

}
