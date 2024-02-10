package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Login5sites {

	public static void main(String[] args) throws InterruptedException {
	
		
		
		ChromeDriver driver1 = new ChromeDriver();
		driver1.manage().window().maximize();
		Thread.sleep(5000);
		driver1.get("https://www.instagram.com/");
		Thread.sleep(6000);
		
		WebElement username= driver1.findElement(By.xpath("//input[@name='username']"));
		username.sendKeys("bhagattushar0102@gmail.com");

		WebElement Password = driver1.findElement(By.xpath("//input[@name='password']"));
		Password.sendKeys("TUs@88774277");

		WebElement LoginButton1 = driver1.findElement(By.xpath("//button[@type='submit']"));
		LoginButton1.click();

		driver1.close();
		
		//2nd site
		
		ChromeDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://app.fireflink.com/signin");
		Thread.sleep(6000);

		WebElement Email = driver.findElement(By.xpath("//input[@name='emailId']"));
		Email.sendKeys("bhagattushar0102@gmail.com");

		WebElement Pass = driver.findElement(By.xpath("//input[@id='mui-2']"));
		Pass.sendKeys("TUs@88774277");

		WebElement LoginButton = driver.findElement(By.xpath("//button[@type='submit']"));
		LoginButton.click();

		driver.close();
		
		
		
		// 3rd site
		
           ChromeDriver driver2 = new ChromeDriver();
		
		driver2.manage().window().maximize();
		Thread.sleep(5000); 
		driver2.get("http://127.0.0.1/login.do;jsessionid=1nshkdrty2jfh");
		Thread.sleep(2000);
		
		
	    WebElement LoginButton2 = driver2.findElement(By.xpath("//a[text()='Login']")); //(//a[.='Login']) this is also one method we can use but cant be trusted
	    LoginButton2.click();
	    
	    //4th
	    
	    
	    ChromeDriver driver3 = new ChromeDriver();
		driver3.manage().window().maximize();
		Thread.sleep(5000);
		driver3.get("https://www.facebook.com/");
		Thread.sleep(4000);
		
		WebElement femail= driver3.findElement(By.xpath("//input[@name='username']"));
		femail.sendKeys("bhagattushar0102@gmail.com");

		WebElement fPassword = driver3.findElement(By.xpath("//input[@name='password']"));
		fPassword.sendKeys("TUs@88774277");

		WebElement fLoginButton1 = driver3.findElement(By.xpath("//button[@type='submit']"));
		fLoginButton1.click();

		driver3.close();
	    
	    //5th site
	    
	    
	    ChromeDriver driver4 = new ChromeDriver();
	    
	    driver4.manage().window().maximize();
	    
	    Thread.sleep(2000);
	    driver4.get("https://www.flipkart.com/");
	    Thread.sleep(4000);
	    
	    WebElement enteremail = driver4.findElement(By.xpath("//input[@class='_18u87m _3WuvDp']"));
		enteremail.sendKeys("9988774555");
	  
	    
	    
	    
	}

}
