package Day21;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class TabAndWindow {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Open first URL in default window
        driver.get("https://www.opencart.com/index.php?route=cms/demo");

        // Open a new Window (Selenium 4.x feature)
        driver.switchTo().newWindow(WindowType.WINDOW);

        // Open second URL in new window
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");

        // Close all browser windows
        driver.quit();
    }
}
