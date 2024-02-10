package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class IdLocator {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://www.facebook.com/");
		Thread.sleep(2000);
		WebElement usnTextbox = driver.findElement(By.id("email")); // to find element named email by id
		usnTextbox.sendKeys("bhagattushar201@gmail.com");

		Thread.sleep(2000);
		WebElement passTextbox = driver.findElement(By.id("pass")); // to find element named password by id
		passTextbox.sendKeys("tu88774277");

		Thread.sleep(2000);
		WebElement loginbutton = driver.findElement(By.tagName("button")); // to find element named button by tagName
		loginbutton.click();

	}

}
