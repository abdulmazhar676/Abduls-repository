package Page_load_timeout;

import java.time.Duration;
import java.time.Instant;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class page_load_time_out {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		Instant Start_time = Instant.now();

		System.out.println(Start_time.toString());

		driver.get("https://www.hyrtutorials.com/");

		Instant EndTime = Instant.now();

		System.out.println(EndTime.toString());

		Duration time = Duration.between(Start_time, EndTime);

		System.out.println("In Seconds" + time.toSeconds());

		System.out.println(driver.getTitle());

		driver.quit();




	}

}
