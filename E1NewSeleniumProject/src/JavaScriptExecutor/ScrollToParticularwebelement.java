package JavaScriptExecutor;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToParticularwebelement {

	public static void main(String[] args) throws InterruptedException {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.get("https://www.selenium.dev/");
        
		
		WebElement scrolltarget = driver.findElement(By.xpath("//h2[text()='News']"));
		
		
        JavascriptExecutor js = (JavascriptExecutor) driver;  // typecating from webdriver to javascript executor
        js.executeScript("arguments[0].scrollIntoView(true)",scrolltarget);  // scroll down operation
        
        
        Thread.sleep(2000);
        
        
        
        

	}

}
