package synchronization;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ExplicitWait {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(10));
	
		driver.get("https://www.shoppersstack.com/");
		
		driver.findElement(By.xpath("//span[text()='APPLE iphone 14 pro']"));
		driver.findElement(By.id("check delivery")).sendKeys("411033");
		
		
		WebElement checkbtn = driver.findElement(By.xpath("//button[@id='check'"));
		wait.until(ExpectedConditions.elementToBeClickable(checkbtn));
		checkbtn.click();
		
		
		
		
	}
 
}
