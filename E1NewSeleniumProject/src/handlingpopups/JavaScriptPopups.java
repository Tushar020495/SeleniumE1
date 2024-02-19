package handlingpopups;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptPopups {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		Thread.sleep(2000);
        driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));

		driver.get("https://omayo.blogspot.com/");

		driver.findElement(By.id("alert1")).click();
		
		Alert alertpopup = driver.switchTo().alert();
		
		alertpopup.accept();          // to click on ok button by popup
		
	//	alertpopup.dismiss();           // this method also works same as accept
		
		
		
	}

}
