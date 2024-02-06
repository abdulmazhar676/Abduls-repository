package Dropdowns;

import java.util.Iterator;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Multi_selection_DD {

	public static void main(String[] args) throws InterruptedException {

		// How to select multi drop-down values using selenium

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/html-dropdown-elements-practice.html");

		WebElement IDE_Name_DD = driver.findElement(By.id("ide"));

		Select IDE_Name_DD1 = new Select(IDE_Name_DD);

		List<WebElement>  IDE_Name_DD_Options = IDE_Name_DD1.getOptions();

		for(WebElement option : IDE_Name_DD_Options) {
			System.out.println(option.getText());
		}

		IDE_Name_DD1.selectByIndex(0);

		Thread.sleep(4000);


		IDE_Name_DD1.selectByValue("ij");

		Thread.sleep(4000);

		IDE_Name_DD1.selectByVisibleText("NetBeans");

		Thread.sleep(4000);

		IDE_Name_DD1.deselectByIndex(0);

		List<WebElement> Deselected_text = IDE_Name_DD1.getAllSelectedOptions();
		
		for (WebElement Deselected_text1 : Deselected_text)
		{
			System.out.println("Deselected_text1" + "  " + Deselected_text1.getText());
		}





	}

}
