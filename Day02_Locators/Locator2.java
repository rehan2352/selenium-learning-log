import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AmazonLocatorExample {
    public static void main(String[] args) throws InterruptedException {
        // Set up the driver (Update path if needed)
        System.setProperty("webdriver.chrome.driver", "C:\\Path\\To\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        // Open Amazon
        driver.get("https://www.amazon.in");
        driver.manage().window().maximize();

        // 1. Using 'name' locator to search for a product
        driver.findElement(By.name("field-keywords")).sendKeys("laptop");
        driver.findElement(By.id("nav-search-submit-button")).click();
        Thread.sleep(3000);

        // 2. Using 'linkText' to click on a visible link
        // Scroll down a bit or search for a link that is visible by text
        // Example: "Mobiles" at the top menu (if available)
        driver.findElement(By.linkText("Mobiles")).click();
        Thread.sleep(3000);

        // 3. Using 'partialLinkText' to click on a link partially matched
        // Example: "Customer" will match "Customer Service"
        driver.findElement(By.partialLinkText("Customer")).click();
        Thread.sleep(3000);

        // Close the browser
        driver.quit();
    }
}
