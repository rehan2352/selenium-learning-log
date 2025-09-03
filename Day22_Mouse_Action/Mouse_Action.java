package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_MouseAction {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://ums.lpu.in/Placements/");
		driver.manage().window().maximize();
		
		//Login The Page
		driver.findElement(By.id("txtUserName")).sendKeys("4522");
		driver.findElement(By.id("txtPassword")).sendKeys("Fana@2006");
		driver.findElement(By.xpath("//*[@id=\"Button1\"]")).click();
		
		WebElement nav=driver.findElement(By.xpath("//span[@class='rmText rmExpandDown']"));
		WebElement attend=driver.findElement(By.xpath("//span[normalize-space()='Mark Drive Attendance']"));
		
		Actions act=new Actions(driver);
		
		//Mouse Hover
		act.moveToElement(nav).perform();
		Thread.sleep(2000);
		
		act.moveToElement(attend).click().perform();
	}

}
