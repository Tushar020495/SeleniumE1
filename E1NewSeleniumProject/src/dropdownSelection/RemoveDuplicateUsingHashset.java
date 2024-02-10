package dropdownSelection;

import java.time.Duration;
import java.util.HashSet;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class RemoveDuplicateUsingHashset {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("url of a site");

		WebElement multiselect = driver.findElement(By.id("menu")); // to find desired dropdown

		Select sel = new Select(multiselect); // we need to create object of select class to access all the nonstatic
											

		HashSet<String> ts = new HashSet<String>();  // to insert options w/o duplicates 
		
		  List<WebElement> options = sel.getOptions();   // to get all options 
		  
		  for (int i = 0; i < options.size(); i++)
		  
		  {
			  String insert = options.get(i).getText();
			  
			  ts.add(insert);
			  
			  
		  }
		  for (String text : ts)
		  
		  {
			  System.out.println(text);  //  will be printed in random order
			  
		  }
		  
		
		
		
	}

}
