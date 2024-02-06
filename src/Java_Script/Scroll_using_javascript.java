package Java_Script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Scroll_using_javascript {

	public static void main(String[] args) throws Exception {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Scroll ot scrollTO operations 
		
			js.executeScript("window.scrollTo(0,500);");
			
			
			Thread.sleep(5000);
			
			// scrollBy 
			
			js.executeScript("window.scrollBy(0,500);");
			
			Thread.sleep(5000);

			
			// ScrollIntoview
			
			js.executeScript("document.getElementById('ty_footer').scrollIntoView();");
			
			
			
	}

}
