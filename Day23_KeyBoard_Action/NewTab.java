package Day21;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Open_The_Link_In_NewTab {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Launch The Browser And Maximize The Window
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        WebElement Blog = driver.findElement(By.xpath("//a[normalize-space()='Blog']"));
        
        // Open a new tab by clicking CTRL + Click
        Actions act = new Actions(driver);
        act.keyDown(Keys.CONTROL).click(Blog).keyUp(Keys.CONTROL).perform();
        
        Set<String> link = driver.getWindowHandles();
        List<String> array = new ArrayList<>(link);
        
        // Switch To New Tab And Click On Link
        driver.switchTo().window(array.get(1));
        driver.findElement(By.xpath("//a[normalize-space()='Manual Testing Materials']")).click();
        
        // Switch Back To Home Page And Send The Value
        driver.switchTo().window(array.get(0));
        driver.findElement(By.xpath("//input[@id='name']")).sendKeys("Hello");
        
        // Close the browser
        driver.quit();
    }
}
