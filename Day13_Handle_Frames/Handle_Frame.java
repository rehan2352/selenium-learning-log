package Day_13;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFrame {

	public static void main(String[] args) {

		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.get("https://ui.vision/demo/webtest/frames/");	
		driver.manage().window().maximize();
		
		//Frame 1
		WebElement frame1=driver.findElement(By.xpath("//frame[@src='frame_1.html']"));
		driver.switchTo().frame(frame1); //passed frame as a webelement switch to frame 1
		
		driver.findElement(By.xpath("//input[@name='mytext1']")).sendKeys("Welcome");
		
		driver.switchTo().defaultContent();  //go back to page
		
		//Frame 2
		WebElement frame2=driver.findElement(By.xpath("//frame[@src='frame_2.html']"));
		driver.switchTo().frame(frame2);
		driver.findElement(By.xpath("//input[@name='mytext2']")).sendKeys("Selenium");
		
		
		driver.switchTo().defaultContent();
		
		WebElement frame3=driver.findElement(By.xpath("//frame[@src='frame_3.html']"));
		driver.switchTo().frame(frame3);
		driver.findElement(By.xpath("//input[@name='mytext3']")).sendKeys("Hello");
		
		//Inner iframe -part of frame 3
		driver.switchTo().frame(0);
		//driver.findElement(By.xpath("//*[@id=\"i9\"]/div[3]/div")).click();
		
		WebElement rdbutton=driver.findElement(By.xpath("//*[@id='i9']/div[3]/div"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].click()", rdbutton);
		
		driver.switchTo().defaultContent();
		
	}

}
