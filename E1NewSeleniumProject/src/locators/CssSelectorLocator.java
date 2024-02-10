package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CssSelectorLocator {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://www.instagram.com/");
		Thread.sleep(2000);
		WebElement usnTextbox = driver.findElement(By.cssSelector("input[aria-label = 'Phone number, username, or email']")); // to find element named email by using cssSelector
                                           // input[aria-label^='ph'] shortcuts
		
		usnTextbox.sendKeys("bhagattushar201@gmail.com");

		WebElement passwrd = driver.findElement(By.cssSelector("input[type='password']")); // to locate password text
														//input[type$='word']							// box and pass the input

		passwrd.sendKeys("eefweiu");

		WebElement loginbutton = driver.findElement(By.cssSelector("button[type='submit']")); // to click on login
																// button[type*='bm']								// button

		loginbutton.click();

	}

}
