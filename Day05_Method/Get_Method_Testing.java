package Day05_WebDriver_Methods;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Get_Method {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver = new ChromeDriver();
		
		// Open the URL on the browser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		Thread.sleep(5000);
		
		// Return the title of the page
		System.out.println(driver.getTitle());
		
		// Return the URL of the page
		System.out.println(driver.getCurrentUrl());
		
		// Return the ID of the single browser window
		System.out.println(driver.getWindowHandle());
		
		// Click on "OrangeHRM, Inc" link to open new window and return all window IDs
		driver.findElement(By.linkText("OrangeHRM, Inc")).click();
		Set<String> windowid = driver.getWindowHandles();
		System.out.println(windowid);
	}
}
