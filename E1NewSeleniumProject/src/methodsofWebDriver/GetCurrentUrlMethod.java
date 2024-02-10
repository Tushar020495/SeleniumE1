package methodsofWebDriver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetCurrentUrlMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		Thread.sleep(5000);

		driver.manage().window().maximize();

		driver.get("https://www.flipkart.com/");
		Thread.sleep(2000);
		String CurrentUrl = driver.getCurrentUrl();
		System.out.println(CurrentUrl);

	}

}
