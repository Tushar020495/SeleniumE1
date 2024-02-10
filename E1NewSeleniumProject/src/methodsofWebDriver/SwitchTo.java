package methodsofWebDriver;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchTo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		Thread.sleep(5000);

		driver.manage().window().maximize();

		driver.get("https://www.google.co.in/");
		Thread.sleep(2000);

		driver.switchTo().activeElement().sendKeys("watch", Keys.ENTER); // to switch control into active element and
																			// enter watch into search bar.

	}

}
