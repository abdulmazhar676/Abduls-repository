package Frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Frames_selenium {

	/* Frame >> A frame tag is used in HTML 4 to define one particular window within a frame set <frameset>
	 * 
	 * Frameset >> The <frameset> tag used in HTML 4 to define <frameset> //frameset is parent and frame is child
	 * 
	 * Iframe >> THis tag specifies an inline frame which is used to embed another document within the current HTML document.
	 * 
	 * 
	 */

	    public static void main(String[] args) throws InterruptedException {
	    	
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/frames-practice.html");

		driver.manage().window().maximize();

		Thread.sleep(5000);

		//switch to frame using FrameID

		driver.switchTo().frame("frm1");

		Select Course_Name =  new Select(driver.findElement(By.id("course")));

		Course_Name.selectByVisibleText("Dot Net");

		System.out.println("");

		Thread.sleep(3000);



	}

}
