package dropdownSelection;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AssignmentFacebookDropdown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.facebook.com/signup");
		
		WebElement daydropdown = driver.findElement(By.id("day"));
		
		WebElement monthdropdown = driver.findElement(By.id("month"));

		WebElement yeardropdown = driver.findElement(By.id("year"));
		
		
		Select daysel = new Select(daydropdown);
		
		   boolean result1 = daysel.isMultiple();
		   
		   System.out.println("day dropdown is multiple?" + result1);
		   
		   List<WebElement> options = daysel.getOptions();
		   
		   for(WebElement we : options)
			   
		   {
			   String Ops = we.getText();
			    System.out.println(Ops);
		   }
		   
		   
		    daysel.selectByIndex(1);
		    
		    daysel.deselectByVisibleText("2");
		    
		    
		    
		 
		  // for month dropdown  
		    
		    
		    
		    
		    Select monthsel = new Select(monthdropdown);
			
			   boolean result2 = monthsel.isMultiple();
			   
			   System.out.println(result2);
			   
			   List<WebElement> options1 = monthsel.getOptions();
			   
			   for(WebElement we : options1)
				   
			   {
				   String Ops1 = we.getText();
				    System.out.println(Ops1);
			   }
			   
			   
			    monthsel.selectByIndex(3);
			    
			    monthsel.deselectByVisibleText("apr");
			    
			    
			    
		    
		    // for year dropdown
			    
			    
			    
			    
			    
			    Select yearsel = new Select(yeardropdown);
				
				   boolean result3 = yearsel.isMultiple();
				   
				   System.out.println(result3);
				   
				   List<WebElement> options2 = yearsel.getOptions();
				   
				   for(WebElement we : options2)
					   
				   {
					   String Ops2 = we.getText();
					    System.out.println(Ops2);
				   }
				   
				   
				  
				    
				    yearsel.deselectByVisibleText("1996");
		    
		    
		
		
		

	}

}
