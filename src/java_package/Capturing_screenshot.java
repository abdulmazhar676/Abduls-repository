package java_package;

import java.io.File;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Capturing_screenshot {

	public static void main(String[] args)
	
	{
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.facebbok.com");
		
		
		//Capturing image and converting into file format
		
		File src =((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);

	}

}
