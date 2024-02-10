package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.google.common.io.Files;

public class ByExpliciteTypeCasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.google.com/");

		TakesScreenshot ts = (TakesScreenshot) driver;            // to perform Typecasting

		File src = ts.getScreenshotAs(OutputType.FILE);     // to take screenshot of webpage
		
		File dest = new File("./screenshots/google.png");   // to specify the location name and extension of screenshot
		Files.copy(src, dest);  // to save screenshot into screenshot folder
		

	}

}
