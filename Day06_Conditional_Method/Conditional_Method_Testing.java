package conditionalmethod;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Conditional_Methods {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://demo.automationtesting.in/Register.html");
        driver.manage().window().maximize();

        // isDisplayed
        boolean logo = driver.findElement(By.xpath("//h1[normalize-space()='Automation Demo Site']")).isDisplayed();
        System.out.println("Displayed Status: " + logo);

        // isEnabled
        boolean enable = driver.findElement(By.xpath("//input[@placeholder='First Name']")).isEnabled();
        System.out.println("Enabled Status: " + enable);

        // for radio button
        boolean enable1 = driver.findElement(By.xpath("//input[@value='Male']")).isEnabled();
        System.out.println("Enabled Status (Radio): " + enable1);

        // isSelected
        boolean selected = driver.findElement(By.xpath("//input[@value='Male']")).isSelected();
        System.out.println("Selected Status: " + selected);
    }
}
