package takeScreenshot;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

import com.google.common.io.Files;

public class ByDownCasting {

	public static void main(String[] args) throws IOException {
		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.get("https://www.flipkart.com/");

		RemoteWebDriver rwd = (RemoteWebDriver)driver;
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		File src = rwd.getScreenshotAs(OutputType.FILE);

		File dest = new File("./Screenshots/Flipkart.png");

		Files.copy(src, dest);

	}

}
