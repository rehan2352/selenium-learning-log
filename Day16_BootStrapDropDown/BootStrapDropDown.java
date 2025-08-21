package Day14;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BootStrapDropDown {

	public static void main(String[] args) {
 
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Open the WebBrowser
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().window().maximize();
		
		
		driver.findElement(By.xpath("//button[contains(@class,'multiselect')]")).click();
		
		//Select Single option
		driver.findElement(By.xpath("//input[@value='Java']")).click();
		
		//Capture All The Elements and find out the size
		List<WebElement>options=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(options.size());
		
		//Printing option from dropdown
//		for(WebElement op:options)
//		{
//			System.out.println(op.getText());
//		}
		
		
		//Select Multiple Options
		for(WebElement op:options)
		{
			String options1=op.getText();
			if(options1.equals("Java")||(options1.equals("SQL")||options1.equals("Python")))
			{
				op.click();
			}
		}
		
		
				
	}

}
