package Implicit_Wait;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class implicit_wait {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) throws InterruptedException {
		
		/* Impliicit wait = selenium web driver edaina oka element 
		 * ni find out cheyadaniki wntha time wait cheyali ah time ni implicit wait antam
		 */
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/waits-demo.html");
		
		driver.findElement(By.id("btn1")).click();
		
		driver.manage().timeouts().implicitlyWait(6, TimeUnit.SECONDS);
		
		
		
		
		driver.findElement(By.id("txt1")).sendKeys("Implicit Wait");
		
		
	}

}
