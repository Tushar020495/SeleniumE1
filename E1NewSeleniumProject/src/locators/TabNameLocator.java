package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabNameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		Thread.sleep(5000);   // stop execution 5 sec.
		driver.get("https://www.facebook.com/");     // to close browser window.

		driver.manage().window().maximize();
		Thread.sleep(2000);
		
		WebElement usertxtbox = driver.findElement(By.tagName("input")); // tag of web element
		
	   usertxtbox.sendKeys("tushar"); // to pass input

	}

}
 