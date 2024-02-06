package Java_Script;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Element_using_cssSelector {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.facebook.com/");

		driver.manage().window().maximize();

		JavascriptExecutor js_css = (JavascriptExecutor) driver;

		WebElement Element = (WebElement) js_css.executeScript("return document.querySelector('#email').value='Abdul';");

		
		
		



	}

}
