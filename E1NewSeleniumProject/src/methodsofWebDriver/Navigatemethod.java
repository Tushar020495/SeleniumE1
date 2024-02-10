package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Navigatemethod {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		driver.navigate().to("https://www.flipkart.com/");
		Thread.sleep(1000);
		driver.navigate().back(); // once browser is open to go backwards
		Thread.sleep(1000);
		driver.navigate().forward();  //once browser is open to go forward
		Thread.sleep(1000);
		driver.navigate().refresh();  //once browser is open to refresh

	}

}
