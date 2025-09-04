package Day23;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Slider_Demo {

    public static void main(String[] args) {
        
        WebDriver driver = new ChromeDriver();
        
        // Launch The Browser And Maximize The Window
        driver.get("https://www.jqueryscript.net/demo/Price-Range-Slider-jQuery-UI/");
        driver.manage().window().maximize();
        
        Actions act = new Actions(driver);
        
        // Minimum slider
        WebElement Min_Slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[1]"));
        System.out.println("Default Location Of The Min_Slider: " + Min_Slider.getLocation());
        act.dragAndDropBy(Min_Slider, 100, 0).perform();
        System.out.println("Location Of The Min_Slider After Moving: " + Min_Slider.getLocation());
        
        // Maximum slider
        WebElement Max_Slider = driver.findElement(By.xpath("//div[@id='slider-range']//span[2]"));
        System.out.println("Default Location Of The Max_Slider: " + Max_Slider.getLocation());
        act.dragAndDropBy(Max_Slider, -100, 0).perform();
        System.out.println("Location Of The Max_Slider After Moving: " + Max_Slider.getLocation());
        
        // Close browser
        driver.quit();
    }
}
