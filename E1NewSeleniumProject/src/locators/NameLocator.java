package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class NameLocator {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://www.instagram.com/");  //  check for facebook  dont use insta link here
		Thread.sleep(2000);
		
		WebElement usnTextbox = driver.findElement(By.name("username")); // to find that element by name locator
		usnTextbox.sendKeys("tushar"); // to enter the value

		Thread.sleep(2000);
		WebElement passTextbox = driver.findElement(By.name("pass"));
		passTextbox.sendKeys("tu88774277");
		
		WebElement clickbutton = driver.findElement(By.className("dayegwgf")); // give whatever class name in code
		

		clickbutton.click();

	}

}
