package Java_Script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Find_Elements_webpage {

	public static void main(String[] args) {


		/*
		 * How to find elements on webpage using javascript executor 
		 * 
		 * id - document.getElementById('');
		 * name - document.getElementsByName('');
		 * className - document.getElementsByClassName('');
		 * tagName - document.getElementsByTagName('');
		 * Css Selector - document.querySelector('');
		 * xpath - document.evaluate("xpath value"),contextNode,nameSpaceResolver,resultType, result).singleNodeValue;
		 * 
		 */


		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		WebElement Element = (WebElement)js.executeScript("return document.getElementById('email');");
		
		Element.sendKeys("Nmmajo");







	}

}
