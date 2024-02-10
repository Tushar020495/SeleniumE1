package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ToFunction {                                        // this is by using textFunction xpath program case2

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("http://127.0.0.1/login.do;jsessionid=1nshkdrty2jfh");
		Thread.sleep(2000);
		
		
	    WebElement LoginButton = driver.findElement(By.xpath("//a[text()='Login']")); //(//a[.='Login']) this is also one method we can use but cant be trusted
	    LoginButton.click();

	}

}
