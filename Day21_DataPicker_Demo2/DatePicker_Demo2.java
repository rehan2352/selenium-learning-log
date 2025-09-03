package Day_20;

import java.time.Duration;
import java.time.Month;
import java.util.HashMap;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DatePicker_Demo2 {

    static Month convertMonth(String Mnth) {
        HashMap<String, Month> monthMap = new HashMap<String, Month>();

        monthMap.put("January", Month.JANUARY);
        monthMap.put("February", Month.FEBRUARY);
        monthMap.put("March", Month.MARCH);
        monthMap.put("April", Month.APRIL);
        monthMap.put("May", Month.MAY);
        monthMap.put("June", Month.JUNE);
        monthMap.put("July", Month.JULY);
        monthMap.put("August", Month.AUGUST);
        monthMap.put("September", Month.SEPTEMBER);
        monthMap.put("October", Month.OCTOBER);
        monthMap.put("November", Month.NOVEMBER);
        monthMap.put("December", Month.DECEMBER);

        Month Vmonth = monthMap.get(Mnth);

        if (Vmonth == null) {
            System.out.println("Invalid Month...");
        }

        return Vmonth;
    }

    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        // Launch The Browser And Maximize The Window
        driver.get("https://testautomationpractice.blogspot.com/");
        driver.manage().window().maximize();

        String year = "2025";
        String month = "October";
        String day = "5";

        driver.findElement(By.xpath("//input[@id='txtDate']")).click();

        // Select Year
        WebElement yearDrp = driver.findElement(By.xpath("//select[@aria-label='Select year']"));
        Select selectYear = new Select(yearDrp);
        selectYear.selectByVisibleText(year);

        // Select Month
        WebElement monthDrp = driver.findElement(By.xpath("//select[@aria-label='Select month']"));
        Select selectMonth = new Select(monthDrp);

        while (true) {

            String DisplayMonth = selectMonth.getFirstSelectedOption().getText();

            Month expectedMonth = convertMonth(month);
            Month currentMonth = convertMonth(DisplayMonth);

            // Compare
            int result = expectedMonth.compareTo(currentMonth);

            // ==0 Same Month
            // <0 Past Month
            // >0 Future Month

            if (result < 0) {
                // past
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
            }

            else if (result > 0) {
                // Future
                driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']")).click();
            }

            else {
                break;
            }

        }

        // Capture Date
        List<WebElement> alldates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));

        for (WebElement dt : alldates) {
            if (dt.getText().equals(day)) {
                dt.click();
                break;
            }
        }

    }

}
