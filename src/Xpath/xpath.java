package Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class xpath {
	
	public static void main (String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.w3schools.com/");
		
		//TYpes of Xpath 
		
		// Abdolute x path 
		
		driver.findElement(By.xpath("/html/body/div/[3]/a[4]"));
		
		
		
		
	}
	

}
