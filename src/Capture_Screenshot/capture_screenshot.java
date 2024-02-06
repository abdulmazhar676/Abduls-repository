package Capture_Screenshot;

import java.io.File;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;

public class capture_screenshot 
{

	public static void main(String[] args) throws Exception 
	{

		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.manage().window().maximize();
		Thread.sleep(5000);

		//File capture
		//Capturing image and converting into file format
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//Create new folder at local system
		FileHandler.createDir(new File("/Users/mohammadabdulmazhar/Desktop/Selenium-WS/Java_selenium/Screenshots"));
		//Copy file into target location
		FileHandler.copy(src, new File("/Users/mohammadabdulmazhar/Desktop/Selenium-WS/Java_selenium/Screenshots\\Image.png"));


		System.out.println("screenshot captured goog");




		driver.close();


	}

}