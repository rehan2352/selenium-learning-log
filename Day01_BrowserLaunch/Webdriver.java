package First;

// Importing necessary Selenium classes
import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webdriver {

    public static void main(String[] args) {
        
        // Creating a ChromeDriver object to launch Chrome browser
        ChromeDriver driver = new ChromeDriver();
        
        // Opening Google's homepage
        driver.get("https://google.com");

        // Fetching and printing the title of the page
        String title = driver.getTitle();
        System.out.println(title);

        // Fetching and printing the current URL of the page
        String currentUrl = driver.getCurrentUrl();
        System.out.println(currentUrl);

        // Fetching the entire page source and printing its length
        String pageSource = driver.getPageSource();
        System.out.println(pageSource.length());

        // Typing "amazon" into Google's search box using XPath locator
        driver.findElement(By.xpath("//*[@id='APjFqb']")).sendKeys("amazon");
    }
}
