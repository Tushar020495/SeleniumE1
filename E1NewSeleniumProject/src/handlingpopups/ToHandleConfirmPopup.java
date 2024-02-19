package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToHandleConfirmPopup {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("confirm")).click();
		
		Alert alertpopup = driver.switchTo().alert();
		Thread.sleep(2000);
		alertpopup.accept();
		
		

	}

}
