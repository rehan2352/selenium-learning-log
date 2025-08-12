package Day11;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleCheckBoxes {

    public static void main(String[] args) throws InterruptedException {
        
        // Create ChromeDriver instance (launches Chrome)
        ChromeDriver driver = new ChromeDriver();
        
        // Open the test page and maximize the window
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();
        
        // ------------------- Locating checkboxes -------------------
        // Find all checkbox input elements that have class 'form-check-input' and type 'checkbox'
        List<WebElement> CheckBox = driver.findElements(By.xpath("//input[@class='form-check-input' and @type='checkbox']"));
        
        // ------------------- Example actions -------------------
        // Select the first three checkboxes (index 0,1,2)
        for (int i = 0; i < 3; i++) {
            CheckBox.get(i).click();
        }
        
        // Wait for 5 seconds so we can observe selection (not recommended for real tests; use explicit waits)
        Thread.sleep(5000);
        
        // If any of the first three checkboxes are selected, unselect them
        for (int i = 0; i < 3; i++) {
            if (CheckBox.get(i).isSelected()) {
                CheckBox.get(i).click();
            }
        }
        
        // Optional: you may want to close the browser at the end
        // driver.quit();
    }
}
