package Navigation_Methids;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class navigation_methods {

	public static void main(String[] args) throws InterruptedException {


		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://www.google.com/");

		Thread.sleep(5000);

		driver.findElement(By.id("APjFqb")).sendKeys("Abdul Mazhar");

		Thread.sleep(5000);

		driver.findElement(By.id("APjFqb")).submit();

		Thread.sleep(5000);

		driver.navigate().to("https://www.facebook.com");

		Thread.sleep(5000);
		driver.findElement(By.id("email")).sendKeys("teast@gmail.com");

		Thread.sleep(5000);

		driver.navigate().refresh();
		Thread.sleep(5000);
		driver.navigate().back();
		
		Thread.sleep(4000);

		driver.navigate().forward();
		
		Thread.sleep(4000);
		
		driver.quit();
		
		


	}

}
