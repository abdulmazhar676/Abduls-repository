package Multiple_windows_or_tabs;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class window_handles {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.hyrtutorials.com/p/window-handles-practice.html");
		
		driver.manage().window().maximize();
		
		Thread.sleep(5000);
		
		// Single Window 
		
		String Parent_window = driver.getWindowHandle();
		
		System.out.println("parent window " + "Parent_window");
		
		
		
		driver.findElement(By.id("newWindowBtn")).click();
		
		Thread.sleep(4000);
		
		Set<String>  window_handles = driver.getWindowHandles();
		
		Thread.sleep(4000);

		
		for (String window_handle : window_handles) {
			
			System.out.println("window_handle");
			
		}
		
	}

}
