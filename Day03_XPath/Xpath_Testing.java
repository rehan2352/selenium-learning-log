package Day_3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath_Testing {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();
        driver.get("https://bugbug.io/blog/testing-frameworks/best-selenium-practice-websites/");
        driver.manage().window().maximize();

        // Xpath with Single Attributes
        driver.findElement(By.xpath("//input[@placeholder='Search for Products, Brands and More']")).sendKeys("Mobile");

        // Xpath With Multiple Attribute
        driver.findElement(By.xpath("//input[@type='text'][@name='q']")).sendKeys("MacBook");

        // Xpath With 'and' or 'or' Operators
        driver.findElement(By.xpath("//input[@type='text' or @name='qdd']")).sendKeys("Charger");
        driver.findElement(By.xpath("//input[@type='text' or @name='q']")).sendKeys("Charger");

        // Xpath with inner Tag
        driver.findElement(By.xpath("//span[text()='Log in']")).click();

        String txt = driver.findElement(By.xpath("//h1[text()='Best Selenium Practice Websites in 2025']")).getText();
        System.out.println(txt);

        // Xpath with contains()
        driver.findElement(By.xpath("//input[contains(@placeholder ,'Search for')]")).sendKeys("Books");

        // Xpath with starts-with()
        driver.findElement(By.xpath("//input[starts-with(@placeholder ,'Search for')]")).sendKeys("Books");
    }
}
