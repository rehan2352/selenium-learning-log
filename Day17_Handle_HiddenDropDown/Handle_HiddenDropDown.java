package Day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open the WebBrowser
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php");
		driver.manage().window().maximize();
		
		//Login the Page
		driver.findElement(By.name("username")).sendKeys("admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button"))
		.click();
		
		//click action where hidden drp down is present
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[1]/aside/nav/div[2]/ul/li[2]/a/span")).click();
		
		//select single option
		driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div"))
		.click();
		Thread.sleep(5000);
		
		//driver.findElement(By.xpath("//span[normalize-space()='Financial Analyst']")).click();
		
		//count number of options
		List<WebElement> options=driver.findElements(By.xpath("//div[@role='listbox']//span"));
		System.out.println(options.size());
		
		//Printing Options
		for(WebElement op:options)
		{
			System.out.println(op.getText());
		}
		
		

	}

}
