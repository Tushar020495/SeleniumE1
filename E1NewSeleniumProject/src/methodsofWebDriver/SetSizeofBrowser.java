package methodsofWebDriver;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class SetSizeofBrowser {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver = new ChromeDriver();
       Thread.sleep(1000);
       driver.manage().window().maximize();
       Thread.sleep(2000);
       
      Dimension targetsize = new Dimension(500, 400);  // to pass width and height
       
       driver.manage().window().setSize(targetsize);  // to pass dim to setSize Method
       driver.close();
       
       
       
       
	}

}

