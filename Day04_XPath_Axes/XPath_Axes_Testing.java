package day4_xpath_axes;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class XpathAxesDemo {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        driver.get("https://money.rediff.com/gainers/bse/daily/groupa");

        // Self Node
        String selfNode = driver.findElement(By.xpath("//a[contains(text(),'Zensar Tech')]/self::a")).getText();
        System.out.println("Self Node: " + selfNode);

        // Parent Node
        String parentNode = driver.findElement(By.xpath("//a[contains(text(),'Zensar Tech')]/parent::td")).getText();
        System.out.println("Parent Node: " + parentNode);

        // Ancestor Node
        String ancestorNode = driver.findElement(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr")).getText();
        System.out.println("Ancestor Node: " + ancestorNode);

        // Child Node Count
        int childCount = driver.findElements(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr/child::td")).size();
        System.out.println("Child Node Count: " + childCount);

        // Descendant Node Count
        int descendantCount = driver.findElements(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr/descendant::*")).size();
        System.out.println("Descendant Node Count: " + descendantCount);

        // Following Node Count
        int followingCount = driver.findElements(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr/following::tr")).size();
        System.out.println("Following Node Count: " + followingCount);

        // Following-Sibling Node Count
        int followingSiblingCount = driver.findElements(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr/following-sibling::tr")).size();
        System.out.println("Following-Sibling Node Count: " + followingSiblingCount);

        // Preceding Node Count
        int precedingCount = driver.findElements(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr/preceding::tr")).size();
        System.out.println("Preceding Node Count: " + precedingCount);

        // Preceding-Sibling Node Count
        int precedingSiblingCount = driver.findElements(By.xpath("//a[contains(text(),'Zensar Tech')]/ancestor::tr/preceding-sibling::tr")).size();
        System.out.println("Preceding-Sibling Node Count: " + precedingSiblingCount);

        driver.quit();
    }
}
