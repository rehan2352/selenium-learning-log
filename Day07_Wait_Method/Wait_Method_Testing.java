package waitmethod;  

// Required imports for Selenium and wait functionalities
import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Wait_Methods {

    public static void main(String[] args) {

        // Launch Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Declare Explicit Wait with timeout of 5 seconds
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

        // Open the registration page
        driver.get("https://demo.automationtesting.in/Register.html");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Wait until the 'Second Password' input field is visible on the page
        WebElement txt = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[@id=\"secondpassword\"]")));

        // Enter the text "rehan@hbd" in the Second Password field
        txt.sendKeys("rehan@hbd");
    }
}
