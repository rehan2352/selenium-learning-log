package Day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropDown {

	public static void main(String[] args) {
		
		// Launch Chrome browser
		WebDriver driver=new ChromeDriver();
		
		// Set implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		// Open the URL
		driver.get("https://testautomationpractice.blogspot.com/");
		
		// Maximize the browser window
		driver.manage().window().maximize();
		
		// Locate dropdown element by xpath
		WebElement DrpElement=driver.findElement(By.xpath("//*[@id=\"country\"]"));
		
		// Create Select class object for dropdown
		Select DrpCountry= new Select(DrpElement);
		
		// Select dropdown by visible text
		DrpCountry.selectByVisibleText("India");
		
		// Select dropdown by value
		DrpCountry.selectByValue("canada");
		
		// Select dropdown by index
		DrpCountry.selectByIndex(3);
		
		// Get all options from dropdown
		List<WebElement>Options=DrpCountry.getOptions();
		
		// Print total number of options
		System.out.println("Total Number Of Drop Down: "+Options.size());
		
		// Print all options using normal for loop
		for(int i=0;i<Options.size();i++)
		{
			System.out.println(Options.get(i).getText());
		}
		
		// Print all options using for-each loop
		for(WebElement op:Options)
		{
			System.out.println(op.getText());
		}
	}
}
