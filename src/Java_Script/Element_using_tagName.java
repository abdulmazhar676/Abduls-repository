package Java_Script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_using_tagName {

	public static void main(String[] args) {


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com");
		
		driver.manage().window().maximize();
		
	//	JavascriptExecutor tagName = (JavascriptExecutor) driver;
		
		//WebElement Element = (WebElement) tagName.executeScript("return document.getElementsByTagName('button')[0];");
		
	//	Element.click();
		
		// How to enter text using java script executor
		
		JavascriptExecutor jsexecutor = (JavascriptExecutor) driver;
		
		jsexecutor.executeScript("document.getElementById('email').value='mazhar';");
		
		
		
		
	}

}
