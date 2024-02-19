package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleHiddenDivision {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://www.makemytrip.com/");

		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//span[text()='Departure']")).click();

		Thread.sleep(2000);
		driver.findElement(By.xpath("//div[text()='March 2024']/../..//p[text()='25']")).click();

	}

}
