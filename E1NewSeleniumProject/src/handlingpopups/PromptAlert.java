package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PromptAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("prompt")).click();
		Thread.sleep(2000);
		
		Alert promptalert = driver.switchTo().alert();
		String text = promptalert.getText();
		promptalert.sendKeys("oko");
		System.out.println(text);
		
		Thread.sleep(1000);
		
		
		
	}

}
