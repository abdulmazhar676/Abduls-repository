package Webelement_properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Tagname_Attribute_CSS_etc {
	
	/*
	 * How to get Tagname , HTML attribute value,Text,CSS Value using selenium webdriver
	 */

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://github.com/login");
		
		driver.manage().window().maximize();
		
// Tagname 
	//	System.out.println(driver.findElement(By.name("commit")).getTagName());
		
		// HTML Attribute value 
		
		//System.out.println(driver.findElement(By.name("commit")).getAttribute("type"));
		
		// Text 
		
		WebElement Text_username = driver.findElement(By.id("login_field"));
		 
		Text_username.sendKeys("abdul mazhar");
		
		System.out.println(Text_username.getAttribute("value"));
		
		// Text 
		System.out.println(driver.findElement(By.xpath("//input[contains(@id,'login_field')]")).getText());
		
		
		
		//css value 
		System.out.println(driver.findElement(By.name("commit")).getCssValue("background-color"));
		
		
		
		
		
		
	}

}
