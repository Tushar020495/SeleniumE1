package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TohandleDisabledElement {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://demoapps.qspiders.com/ui?scenario=1");

		Thread.sleep(1000);

		driver.findElement(By.xpath("//li[text()='Disabled']")).click();
		Thread.sleep(2000);

		WebElement disabledtextbox = driver.findElement(By.id("name"));
		
		JavascriptExecutor js = (JavascriptExecutor) driver; // typecating from webdriver to javascript executor
		
		js.executeScript("document.getElementById('name').value='admin'"); // to pass input into disabled element we
																			// have used javascript code
																			// and methods of javascript here
	//	js.executeScript("document.getElementById('name').value=''"); // to remove the already present content in disabled text box
		
		
		js.executeScript("arguments[0].value=''",disabledtextbox);
		
		
	}

}
