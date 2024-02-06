package HTML_Controls;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Basic_HTML_Controls {

	public static void main(String[] args) throws InterruptedException {


		/* Basic HTML COntrols are 
		 * TextBox
		 * Link
		 * Button
		 * Radio Button
		 * Checkbox 
		 * Dropdown
		 */

		// How to handle the links,buttons,radio buttons,check boxes and drop down using selenium webdriver ? 

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/basic-controls.html");

		driver.manage().window().maximize();

		WebElement First_name =	driver.findElement(By.id("firstName"));

		First_name.sendKeys("abdul Mazhar");

		WebElement Radio_button_female = driver.findElement(By.id("femalerb"));

		Radio_button_female.click();

		Thread.sleep(5000);


		WebElement Check_box = driver.findElement(By.id("englishchbx"));

		Check_box.click();

		Thread.sleep(5000);

		WebElement Check_box1 = driver.findElement(By.name("language"));


		Check_box.click();
		Thread.sleep(5000);

		if (Check_box1.isSelected()) // to uncheck the checked box
			Check_box1.click();

		Thread.sleep(5000);

		WebElement Register_button = driver.findElement(By.id("registerbtn"));

		Register_button.click();
		Thread.sleep(5000);


		WebElement Link_text = driver.findElement(By.linkText("Click here to navigate to the home page"));


		Link_text.click();














	}

}
