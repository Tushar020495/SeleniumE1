package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CloseMethod {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		Thread.sleep(5000);   // stop execution 5 sec.
		driver.close();       // to close browser window.

	}

}
