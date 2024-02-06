package App_login_test;

import org.testng.annotations.Test;
import org.testng.AssertJUnit;
import static org.testng.Assert.assertEquals;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class login_test_using_selenium 
{
	@Test
	public void login_using_selenium()
	{
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		
		driver.get("https:www.facebook.com");
		driver.findElement(By.id("email")).sendKeys("mazhar");
		driver.findElement(By.id("pass")).sendKeys("mazhar123");
		driver.findElement(By.name("login")).click();
		AssertJUnit.assertEquals(driver.getTitle(), "Facebook");
		
		driver.close();
		
		
	}

}
