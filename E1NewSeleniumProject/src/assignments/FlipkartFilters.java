package assignments;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;

public class FlipkartFilters {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(22));
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(22));
		
		
		
		driver.get("https://www.flipkart.com/account/login");
		
		driver.findElement(By.name("q")).sendKeys("hp laptop");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
		
		driver.findElement(By.xpath("//div[text()='Brand']")).click();
		driver.findElement(By.xpath("//div[text()='HP']/preceding-sibling::div[@class='_24_Dny']")).click();
		
		wait.until(ExpectedConditions.elementToBeClickable(null))
		
		
		
		
		
		
		
		
		
	 	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
