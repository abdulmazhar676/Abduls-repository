package Text_Boxes;

import javax.lang.model.element.Element;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_text_boxes {

	public static void main(String[] args) throws InterruptedException {
		
		//How to handle text boxex using selenium webdriver 
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/login");
		
		Thread.sleep(5000);
		
		WebElement Element_Username = driver.findElement(By.id("login_field"));
		
		if(Element_Username.isDisplayed()) {
			if(Element_Username.isEnabled()) {
				
				Element_Username.sendKeys("Abdul Mazhar");
				
				String Entered_text = Element_Username.getAttribute("value");
				
				System.out.println("Entered_text");
				
				Thread.sleep(5000);

				Element_Username.clear();
				
			}
			else
				System.err.println("Username textbox is not enabled");
			
		}
		else
			System.err.println("Username textbox is not displayed");
		
	}
	
}
