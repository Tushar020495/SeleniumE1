package methodsofWebDriver;

import org.openqa.selenium.WebDriver;



import org.openqa.selenium.chrome.ChromeDriver;



public class GetTitle {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver(); // to launch chrome browser.
		Thread.sleep(5000); // stop execution 5 sec.
		driver.get("https://www.flipkart.com/");   // to open particular web page 
		Thread.sleep(2000);
		String Title = driver.getTitle();  // to get the title(backend title while designing) of entered url.

		System.out.println(Title);
		Thread.sleep(2000);
		 driver.close();

	}

}
