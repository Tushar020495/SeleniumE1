package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SubmitMethod {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.instagram.com/");
              
		driver.findElement(By.className("username")).sendKeys("tushar");
		driver.findElement(By.className("password")).sendKeys("123456789");
		
		WebElement loginbutton = driver.findElement(By.xpath("//div[text()='Log in']"));
		
		loginbutton.submit();
		
		
		
		
		
	}

}
