package Day12;

import org.openqa.selenium.chrome.ChromeDriver;

public class HandleAuthenticatedPopup {

    public static void main(String[] args) {

        ChromeDriver driver = new ChromeDriver();

        // Handle AuthenticatedPopUp
        // Syntax: http://username:password@URL
        driver.get("http://admin:admin@the-internet.herokuapp.com/basic_auth");
    }
}
