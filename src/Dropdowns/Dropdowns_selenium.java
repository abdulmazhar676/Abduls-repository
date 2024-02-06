package Dropdowns;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdowns_selenium {

	public static void main(String[] args) throws InterruptedException {

		// how to handle drop-downs in selenium 
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		driver.manage().window().maximize();

		WebElement Drop_down = driver.findElement(By.id("course"));
		
		Select Course_Name_DD = new Select(Drop_down);
		
		Course_Name_DD.selectByValue("net");
		
		Thread.sleep(5000);
		
		
		Course_Name_DD.selectByIndex(4);
		
		Thread.sleep(5000);

		Course_Name_DD.selectByVisibleText("Python");

		
		
		
		
		
		

	}

}
