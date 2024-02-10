package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PartialLinkTextLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		
		WebElement partoflink = driver.findElement(By.partialLinkText("?")); //to locate forgot password link
		partoflink.click();
		driver.close();

	}

}
