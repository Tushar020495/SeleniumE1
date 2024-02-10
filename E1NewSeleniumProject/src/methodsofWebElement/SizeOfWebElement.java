package methodsofWebElement;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SizeOfWebElement {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://127.0.0.1/login.do");
		
		WebElement loginbutton = driver.findElement(By.id("loginButton"));
		
                 Dimension sizelb = loginbutton.getSize();
                 
                 int height = sizelb.getHeight();
                 int width = sizelb.getWidth();
                 
                 System.out.println(height);
                 System.out.println(width);
                 
                 
                 
	}

}
