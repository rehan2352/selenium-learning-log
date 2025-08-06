package Day09_HandleBrowserWindows;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleBrowserWindow {

	public static void main(String[] args) {

		// Launch Chrome browser
		ChromeDriver driver = new ChromeDriver();

		// Apply implicit wait for 10 seconds
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Open Flipkart login page
		driver.get("https://www.flipkart.com/account/login?ret=/");

		// Maximize the browser window
		driver.manage().window().maximize();

		// Click on "Privacy Policy" link to open new tab/window
		driver.findElement(By.linkText("Privacy Policy")).click();

		// Get all the window IDs opened by WebDriver
		Set<String> windowIds = driver.getWindowHandles();

		// ------------------ APPROACH 1: Using List ------------------
		List<String> windowList = new ArrayList<>(windowIds);

		String ParentsId = windowList.get(0);  // Main window
		String ChildId = windowList.get(1);    // Newly opened window

		// Switch to Child Window and print its title
		driver.switchTo().window(ChildId);
		System.out.println("Child Window Title: " + driver.getTitle());

		// Switch back to Parent Window and print its title
		driver.switchTo().window(ParentsId);
		System.out.println("Parent Window Title: " + driver.getTitle());

		// ------------------ APPROACH 2: Using Loop (Optional for multiple windows) ------------------
		/*
		for (String window : windowIds) {
			String title = driver.switchTo().window(window).getTitle();

			if (title.equals("Here's the amazing journey that you've had with Flipkart")) {
				System.out.println("Child Window URL: " + driver.getCurrentUrl());
			}
		}
		*/

	}
}
