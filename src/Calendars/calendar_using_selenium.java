package Calendars;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class calendar_using_selenium {

	public static void main(String[] args) throws Exception {


		WebDriver driver = new ChromeDriver();
		
	driver.get("https://www.hyrtutorials.com/p/calendar-practice.html");
		
	driver.manage().window().maximize();
		
		
		// int day = 31;
		
		// First Date selection 
	//	driver.findElement(By.id("first_date_picker")).click();
	//	Thread.sleep(5000);
	//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//a[text()="+day+"]")).click();
		
		// Second date picker
		
	//	driver.findElement(By.id("second_date_picker")).click();
		
		
	//	driver.findElement(By.xpath("//table[@class='ui-datepicker-calendar']//td[not(contains(@class,'ui-datepicker-other-month '))]/a[text()="+day+"]")).click();
		
	//	Thread.sleep(5000);
		
	//	driver.quit();
		
		// Third Date 
		
	
		String targetDate = "20/Jan/2023";
		
		
		
		try {
			SimpleDateFormat targetDateFormat = new SimpleDateFormat("dd/MMM/yyyy");
			targetDateFormat.setLenient(false);
			Date formattedTargetDate = targetDateFormat.parse(targetDate);
			
			
			
		} catch (Exception e) {
			
			throw new Exception("check the input date");

		}
		
		
		
		
	}

}
