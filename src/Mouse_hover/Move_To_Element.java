package Mouse_hover;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Move_To_Element {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		Actions action = new Actions(driver);
		
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo.html");				
				
		action.contextClick(driver.findElement(By.xpath("//span[.='right click me']"))).perform();
		
		driver.findElement(By.xpath("//li[.='Edit']")).click();
		
		Thread.sleep(5000);
		
		Alert alert = driver.switchTo().alert();
		
		Thread.sleep(5000);

		System.out.println(alert.getText());
		
		alert.accept();
		
		
		
		

		
		
	}

}
