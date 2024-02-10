package dropdownSelection;

import java.time.Duration;
import java.util.List;
import java.util.TreeSet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownByTreeset {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("url of a site");

		WebElement multiselect = driver.findElement(By.id("menu")); // to find desired dropdown

		Select sel = new Select(multiselect); // we need to create object of select class to access all the nonstatic
												// methods of select class

		TreeSet<String> ts = new TreeSet<String>(); // to remove duplicate options // to create object of treeset
		List<WebElement> options = sel.getOptions(); // to get list of all options

		for (WebElement we : options) {
			String textToInsert = we.getText();
			ts.add(textToInsert);

		}

		for (String s : ts)

		{

			System.out.println(s);
		}

	}

}
