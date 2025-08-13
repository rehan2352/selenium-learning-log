package Day_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment_Handle_Frame {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		//Launch The Browser
		driver.get("https://ui.vision/demo/webtest/frames/");
		
		//Maximize the Window
		driver.manage().window().maximize();
		
		WebElement frame=driver.findElement(By.xpath("//frame[@src='frame_5.html']"));
		driver.switchTo().frame(frame);
		
		//driver.findElement(By.xpath("//input[@name='mytext5']")).sendKeys("Kya Haal Hai Bhaii");
		
		driver.findElement(By.xpath("//a[normalize-space()='https://a9t9.com']")).click();
		
		driver.switchTo().defaultContent();
		
		boolean visible=driver.findElement(By.xpath("//*[@id=\"logo\"]/img")).isDisplayed();
		System.out.println(visible);
		
		
		
	}

}  