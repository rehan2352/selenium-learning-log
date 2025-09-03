package Day22;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Handle_DragAndDropAction {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		
		Actions act=new Actions(driver);
		
		//Drag And Drop
		WebElement first=driver.findElement(By.xpath("//img[@id='mongo']"));
		WebElement second=driver.findElement(By.xpath("//img[@id='angular']"));
		WebElement third=driver.findElement(By.xpath("//img[@id='node']"));
		WebElement target=driver.findElement(By.xpath("//div[@id='droparea']"));		
		
		act.dragAndDrop(first, target).perform();
		act.dragAndDrop(second, target).perform();
		act.dragAndDrop(third, target).perform();
				
		

	}

}
