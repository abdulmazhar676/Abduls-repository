package java_package;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selenium_test {

	public static void main(String[] args) throws InterruptedException
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://v1.hdfcbank.com/branch-atm-locator");
		
		WebElement State_Andhra=driver.findElement(By.xpath("//option[@value='andhra-pradesh'][contains(.,'Andhra Pradesh')]"));
		State_Andhra.click();
		
		
		Thread.sleep(3000);  //Timeout to laod cities
		
		WebElement City_Kurnool=driver.findElement(By.xpath(""));
		City_Kurnool.click();
		
		driver.findElement(By.name("cot[]")).click();
		
	
		
		
		
	
	
		
		

		//driver.findElement(By.id("email")).sendKeys("9010588301");
		
		//driver.findElement(By.id("pass")).sendKeys("Mazhar123");
		
		// Thread.sleep(5000);
		
		
		// driver.findElement(By.name("login")).click(); 
		
		// WebElement Element =driver.findElement(By.xpath("//input[contains(@id,'email')]"));
		
	//	Element.sendKeys("abdul mazhar");
		
		
		
		
		
	}

}
