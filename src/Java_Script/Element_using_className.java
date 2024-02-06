package Java_Script;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_using_className {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		JavascriptExecutor className = (JavascriptExecutor) driver;
		
		WebElement Element = (WebElement) className.executeScript("return document.getElementsByClassName('inputtext _55r1 _6luy')[1];");
		
		Element.sendKeys("Abdul Mazhar");
		
		
		
		
		
		
		
		
		
		
	}

}
