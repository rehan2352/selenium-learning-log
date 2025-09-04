package Day21;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class KeyBord_Action {

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Launch The Browser And Maximize The Window
        driver.get("https://text-compare.com/");
        driver.manage().window().maximize();

        // Type some text in first box
        driver.findElement(By.id("inputText1")).sendKeys("Hello Guy's");

        Actions act = new Actions(driver);

        // CTRL + A (Select all)
        act.keyDown(Keys.CONTROL).sendKeys("A").keyUp(Keys.CONTROL).perform();

        // CTRL + C (Copy)
        act.keyDown(Keys.CONTROL).sendKeys("C").keyUp(Keys.CONTROL).perform();

        // TAB (Move to second textbox)
        act.sendKeys(Keys.TAB).perform();

        // CTRL + V (Paste)
        act.keyDown(Keys.CONTROL).sendKeys("V").keyUp(Keys.CONTROL).perform();

        // Just to confirm, print the copied text from second box

        driver.quit();
    }
}
