package assignments;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class TrelloDragAndDrop {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		driver.get("https://trello.com/b/eClDlKID/tusharfirst");

		driver.findElement(By.xpath("//a[text()='Log in']")).click();
		driver.findElement(By.id("user")).sendKeys("bhagattushar0102@gmail.com");
		driver.findElement(By.id("login")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement enterpass = driver.findElement(By.className("css-1cab8vv"));

		enterpass.sendKeys("TUs@88774277");

		driver.findElement(By.xpath("//button[@id='login-submit']")).click();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));

		WebElement drag = driver.findElement(By.xpath("//a[text()='mock absent']"));

		WebElement drop = driver.findElement(By.xpath("//h2[text()='java']"));

		Actions act = new Actions(driver);

		act.dragAndDrop(drag, drop).perform();

		WebElement drag2 = driver.findElement(By.xpath("(//a[text()='mock present']) [1]"));

		WebElement drop2 = driver.findElement(By.xpath("//h2[text()='manual']"));

		Actions act2 = new Actions(driver);

		act2.dragAndDrop(drag2, drop2).perform();
		
		
		
		WebElement drag3 = driver.findElement(By.xpath("(//div[@class='KWQlnMvysRK4fI ui-droppable'])[1]"));

		WebElement drop3 = driver.findElement(By.xpath("//h2[text()='sql']"));

		Actions act3 = new Actions(driver);

		act3.dragAndDrop(drag3, drop3).perform();
		
		
	WebElement rightclick = driver.findElement(By.xpath("(//div[@class='KWQlnMvysRK4fI ui-droppable'])[3]"));
		
		act.contextClick(rightclick).perform();
		
		
		
		 List<WebElement> printoptions = driver.findElements(By.xpath("//div[@class='ozCejPnL4yzsJ4 kos2yeJ8bcHAWx']"));
		
			
   for(int i =0;i< printoptions.size(); i++ )
			   
		   {
			  System.out.println(printoptions.get(i).getText());
		   }
		   Thread.sleep(2000);
			
			
			
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
