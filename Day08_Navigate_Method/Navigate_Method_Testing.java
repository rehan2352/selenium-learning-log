package navigatecommand;  // ✅ Package name updated

import java.net.MalformedURLException;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigateCommand {

    public static void main(String[] args) throws MalformedURLException {

        // Launch Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Navigate to Flipkart homepage
        driver.navigate().to("https://www.flipkart.com/");

        // Navigate to Flipkart login page
        driver.navigate().to("https://www.flipkart.com/account/login?ret=/");

        // Navigate back to previous page (Flipkart homepage)
        driver.navigate().back();
        System.out.println("After Back: " + driver.getCurrentUrl());

        // Navigate forward to login page
        driver.navigate().forward();
        System.out.println("After Forward: " + driver.getCurrentUrl());

        // Refresh the current page
        driver.navigate().refresh();
    }
}
