package Browser_Launchh;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_finder {

	public static void main(String[] args) throws InterruptedException {
		
		// How to find elements using selenium web driver ? 
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://github.com/login");
		
		Thread.sleep(5000);
		
		driver.findElement(By.id("login_field"));
		
		
		
	}
	public static void highlight(WebDriver driver , WebElement element) {
		JavascriptExecutor jsExecutor = (JavascriptExecutor) driver;
		
		jsExecutor.executeScript("arguments[0]., null");
	}
	

}
