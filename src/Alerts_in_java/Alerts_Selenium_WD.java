package Alerts_in_java;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Alerts_Selenium_WD {

	public static void main(String[] args) throws InterruptedException {

		//How to handle alerts in webpage using selenium webdriver

		WebDriver driver = new ChromeDriver();

		driver.get("https://www.hyrtutorials.com/p/alertsdemo.html");

		driver.manage().window().maximize();

		driver.findElement(By.id("alertBox")).click();

		Thread.sleep(5000);

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(4000);

		driver.switchTo().alert().accept();

		Thread.sleep(4000);


		driver.findElement(By.id("confirmBox")).click();

		Thread.sleep(5000);


		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(5000);

		driver.switchTo().alert().dismiss();

		Thread.sleep(5000);



		//Prompt Box

		driver.findElement(By.id("promptBox")).click();

		Thread.sleep(5000);

		System.out.println(driver.switchTo().alert().getText());

		Thread.sleep(5000);

		driver.switchTo().alert().sendKeys("Abdul Mazhar");

		Thread.sleep(4000);

		driver.switchTo().alert().accept();
		










	}

}
