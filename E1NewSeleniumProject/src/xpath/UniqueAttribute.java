package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class UniqueAttribute {

	public static void main(String[] args) throws InterruptedException {
		
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(6000);
		
		//WebElement signinlink = driver.findElement(By.partialLinkText("Sign In")); //to locate forgot password link
	   // signinlink.click();
    
	    // Thread.sleep(2000);
	    
	    
	    WebElement Email = driver.findElement(By.xpath("//input[@name='emailId']"));
	    Email.sendKeys("bhagattushar0102@gmail.com");
	    
	    
	    WebElement Pass = driver.findElement(By.xpath("//input[@id='mui-2']"));
	    Pass.sendKeys("TUs@88774277");
	    
	    WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
	    LoginButton.click();
	    
	    driver.close();
	    
	}

}
