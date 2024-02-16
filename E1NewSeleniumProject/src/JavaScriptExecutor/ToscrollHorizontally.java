package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToscrollHorizontally {

	public static void main(String[] args) throws InterruptedException {
		
		
	        
	        WebDriver driver=new ChromeDriver();
	        Thread.sleep(2000);
			
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
	        
	        
	        driver.get("https://omayo.blogspot.com/");
	        JavascriptExecutor js = (JavascriptExecutor) driver; 
	        js.executeScript("window.scrollBy(500,0)");
	         Thread.sleep(1000);
	         js.executeScript("window.scrollBy(-182,0)");
             
	         driver.close();
	}

}
