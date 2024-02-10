package methodsofWebDriver;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SetpositionMethod {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();

		Thread.sleep(2000);

		driver.manage().window().maximize();

		Thread.sleep(2000);

		Point targetPoint = new Point(400, 500); // to pass x and y coordinates

		driver.manage().window().setPosition(targetPoint); // to pass coordinated to setposition Method

		driver.close();
	}

}
