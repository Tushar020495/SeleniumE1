package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToscrollAnyDirection {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
        
        JavascriptExecutor js = (JavascriptExecutor) driver;  // typecating from webdriver to javascript executor
        js.executeScript("window.scrollBy(0,1000)");  // scroll down operation
        
        
        Thread.sleep(2000);
        
        // to scroll upwards
        
        js.executeScript("window.scrollBy(0,-1000)");
        Thread.sleep(2000);
        
        // to scroll left and right  HORIZONTAL scrolling
        driver.close();
        
        Thread.sleep(2000);
        
        WebDriver driver1=new ChromeDriver();
        Thread.sleep(2000);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        
        
        driver.get("https://omayo.blogspot.com/");
        
        js.executeScript("window.scrollBy(500,0)");
         Thread.sleep(1000);
         js.executeScript("window.scrollBy(-182,0)");
        
        
        
        
        
        
        
        
        
        
        
        
	}

}
