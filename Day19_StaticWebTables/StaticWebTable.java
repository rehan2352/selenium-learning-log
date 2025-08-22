package Day16;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleStaticTable {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().window().maximize();
		
		//find total number rows in table
		int rows=driver.findElements(By.xpath("//table[@name='BookTable']//tr")).size(); //Multiple Table
		System.out.println("Total Number Of Row Present in The Table: "+rows);
		
		//We Can use TagName if only one table present in web page
//		int rows=driver.findElements(By.tagName("tr")).size();    //Single Table
//		System.out.println("Total Number Of Row Present in The Table: "+rows);
		
		//Find total number of column present in the table
		int col=driver.findElements(By.xpath("//table[@name='BookTable']//th")).size(); //Multiple table
		System.out.println("Total Number Of Column Present in The Table: "+col);
		
//		int c=driver.findElements(By.tagName("th")).size(); //Single Table
//		System.out.println(c);
		
		//Read Data from Specific Row and Column(ex:5th row and 1st col)
		String Data=driver.findElement(By.xpath("//table[@name='BookTable']//tr[5]//td[1]")).getText();
		System.out.println(Data);
		
		//Read The Data From all Rows and Column
		
		/*
		for(int r=2;r<=rows;r++)
		{
			for(int c=1;c<=col;c++)
			{
				String value=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td["+c+"]")).getText();
				System.out.print(value+"\t");
			}
			System.out.println();
		}
		*/
		
		//Print The BookName Whose Author name is Mukesh
		/*
		for(int r=2;r<=rows;r++)
		{
			String AuthorName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[2]")).getText();
			if(AuthorName.equals("Mukesh"))
			{
				String BookName=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[1]")).getText();
                System.out.println(BookName+"\t"+AuthorName);
			}
		}
		*/
		
		//Find The Total Price Of all The Book
		int total=0;
		for(int r=2;r<=rows;r++)
		{
			String price=driver.findElement(By.xpath("//table[@name='BookTable']//tr["+r+"]//td[4]")).getText();
			total+=Integer.parseInt(price);
		}
		
		System.out.println("The Total Of All The Book Is:"+total);
		
	}

}
