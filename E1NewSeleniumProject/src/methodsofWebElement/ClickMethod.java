package methodsofWebElement;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ClickMethod {

	public static void main(String[] args) {
		 WebDriver driver = new ChromeDriver();
		 
		 driver.manage().window().maximize();
		 
		 driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(55));
		 
		 
		 driver.get("http://127.0.0.1/login.do");
		 
		 WebElement loginbuttn= driver.findElement(By.id("loginButton"));
		 loginbuttn.click();  // to click only
		 
		 loginbuttn.clear();  // to clear 
		 
		 
		 Dimension size = loginbuttn.getSize();
		int height = size.getHeight();
		int wiidth = size.getWidth();
		
		System.out.println("height is " +height +"width is " +wiidth);
		
		 
		 
	}

}
