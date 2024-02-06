package Java_Script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Highlight_eelement_using_jascript {

	public static void main(String[] args) throws Exception {


		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js = (JavascriptExecutor) driver;

		// Border Highlight 
		js.executeScript("return document.querySelector('#email').style.border ='5px red solid';");

		Thread.sleep(5000);
		
		// Back ground Highlight 
		
		js.executeScript("document.getElementById('email').style.background='yellow';");
		
		Thread.sleep(6000);
		
		// Back ground + Border highlight 
		
		js.executeScript("document.getElementById('pass').setAttribute('style','border:8px green solid;background:grey');");
		
		
	}

}
