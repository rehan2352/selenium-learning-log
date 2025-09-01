package Day_20;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Handle_Date_Picker {

	static void SelectFutureDate(WebDriver driver, String Year, String Month, String Day) {

		driver.findElement(By.xpath("//input[@type='text' and @id='datepicker']")).click();

		while (true) {
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual
																											// year
			String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actual
																												// month

			if (currYear.equals(Year) && currMonth.equals(Month)) {
				break;
			}

			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();// Next
			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-w']")).click();//prev
		}

		// Select Date
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for (WebElement dt : date) {
			if (dt.getText().equals(Day)) {
				dt.click();
				break;
			}
		}

	}

	// Select PastDate
	static void SelectPastDate(WebDriver driver, String Year, String Month, String Day) {

		driver.findElement(By.xpath("//input[@type='text' and @id='datepicker']")).click();

		while (true) {
			String currYear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']")).getText();// actual
																											// year
			String currMonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// actual
																												// month

			if (currYear.equals(Year) && currMonth.equals(Month)) {
				break;
			}

			// driver.findElement(By.xpath("//span[@class='ui-icon
			// ui-icon-circle-triangle-e']")).click();//Next
			driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();// prev
		}

		// Select Date
		List<WebElement> date = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tr//td//a"));

		for (WebElement dt : date) {
			if (dt.getText().equals(Day)) {
				dt.click();
				break;
			}
		}

	}

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Launch The Browser And Maximize The Window
		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().window().maximize();

		// Switch to frame
		driver.switchTo().frame(0);
		
		//SelectPastDate(driver,"2022","May","12");
        SelectFutureDate(driver,"2025","December","20");
	}
}
