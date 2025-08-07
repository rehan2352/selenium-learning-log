package Practice_Ques;

import java.time.Duration;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Fetching_WindoIDs {

    public static void main(String[] args) throws InterruptedException {

        // Step 1: Launch Chrome browser
        ChromeDriver driver = new ChromeDriver();

        // Set implicit wait of 10 seconds for elements to be found
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Open the test automation practice website
        driver.get("https://testautomationpractice.blogspot.com/");

        // Maximize the browser window
        driver.manage().window().maximize();

        // Step 1: Enter "selenium" in the Wikipedia search box
        driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-input\"]")).sendKeys("selenium");

        // Click the search button
        driver.findElement(By.xpath("//*[@id=\"Wikipedia1_wikipedia-search-form\"]/div/span[2]/span[2]/input")).click();

        // Wait for search results to load
        Thread.sleep(2000);

        // Step 2: Find all the search result links under the search result section
        List<WebElement> LinkCount = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));

        // Store the current (main) window handle to return back later
        String mainWindow = driver.getWindowHandle();

        // Step 3: Loop through each link
        for (int i = 0; i < LinkCount.size(); i++) {

            // Re-locate the search links in case DOM changes after click
            LinkCount = driver.findElements(By.xpath("//div[@id='Wikipedia1_wikipedia-search-results']//a"));

            // Get the current link element
            WebElement link = LinkCount.get(i);

            // Step 4: Store the current set of open window handles before clicking
            Set<String> windowsBeforeClick = driver.getWindowHandles();

            // Click the link (expected to open a new window/tab)
            link.click();

            // Wait for the new window to open
            Thread.sleep(2000);

            // Get all window handles after the new window/tab has opened
            Set<String> windowsAfterClick = driver.getWindowHandles();

            // Step 4: Compare the two sets to find the new window handle
            for (String id : windowsAfterClick) {
                if (!windowsBeforeClick.contains(id)) {
                    // Print the new window ID for this link
                    System.out.println("New Window ID for link " + link.getText() + ": " + id);
                }
            }
        }

        // Close all browser windows and end the session
        driver.quit();
    }
}
