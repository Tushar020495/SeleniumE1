package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetSourceMethod {
	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://www.flipkart.com/"); 
		Thread.sleep(2000);
		String PageSource = driver.getPageSource();

		System.out.println(PageSource);
		Thread.sleep(2000);
		 driver.close();

	}
}
