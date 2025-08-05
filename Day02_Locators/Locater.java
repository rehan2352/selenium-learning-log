package Day2;  // Package name changed from Day3 to Day2

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeTest {

	public static void main(String[] args) {
		
		// Step 1: Launch a new Chrome browser instance
		ChromeDriver driver = new ChromeDriver();
		
		// Step 2: Navigate to the Amazon India homepage
		driver.get("https://www.amazon.in/");
		
		// Step 3: Maximize the browser window for better visibility
		driver.manage().window().maximize();
		
		// ---------------------- CSS Selector Examples ----------------------

		// Example 1: Using ID selector
		// Syntax: #id
		// Locate the search textbox using its ID and type "Tshirt"
		driver.findElement(By.cssSelector("#twotabsearchtextbox")).sendKeys("Tshirt");

		// Locate the search button using ID and click it
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		// Example 2: Using Class selector
		// Syntax: .classname
		// Try to find the search box using a common class name and enter "Jeans"
		driver.findElement(By.cssSelector(".nav-input")).sendKeys("Jeans");

		// Click the search button again
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		// Example 3: Using Attribute selector
		// Syntax: [attribute='value']
		// Locate the search textbox using its placeholder attribute and type "Shirt for men"
		driver.findElement(By.cssSelector("[placeholder='Search Amazon.in']")).sendKeys("Shirt for men");

		// Click the search button
		driver.findElement(By.id("nav-search-submit-button")).click();
		
		
		// Example 4: Using Tag + Class + Attribute selector
		// Syntax: tag.classname[attribute='value']
		// Locate the search textbox using tag name + class + attribute and type "Shoes for men"
		driver.findElement(By.cssSelector("input.nav-input[name='field-keywords']")).sendKeys("Shoes for men");

		// Alternate way using only class and attribute (but may not always work reliably due to multiple matches)
		driver.findElement(By.cssSelector(".nav-input[name='field-keywords']")).sendKeys("Shoes for men");

		// Note: The above line is extra and may trigger multiple searches, so you can comment one of them
	}
}
