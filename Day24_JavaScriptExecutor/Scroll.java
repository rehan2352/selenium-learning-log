package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollBar {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver=new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        JavascriptExecutor js= (JavascriptExecutor)driver;
        
        //Scrolling the page by using pixel number
//        js.executeScript("window.scrollBy(0,3000)", "");
//        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        //scroll the page till element is visible
//        WebElement ele=driver.findElement(By.xpath("//h2[normalize-space()='Visitors']"));
//        js.executeScript("arguments[0].scrollIntoView()", ele);
//        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        //scroll till end of the page
        js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
        System.out.println(js.executeScript("return window.pageYOffset;"));
        
        Thread.sleep(5000);
        //scrolling up to initial position
        js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");
	}

}
