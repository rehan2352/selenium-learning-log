package Day24;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUploded {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
		driver.manage().window().maximize();
		
//		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\Users\\md  rehan\\OneDrive\\Desktop\\selenium-learning-log\\Day03_XPath//README.txt");
//        
//		if(driver.findElement(By.xpath("//ul[@id='fileList']//li")).getText().equals("README.txt"))
//		{
//			System.out.println("file successfully uploded");
//		}
//		else
//		{
//			System.out.println("file not uploded");
//		}
		
		//Multiple file uploded
		String file1="C:\\Users\\md  rehan\\OneDrive\\Desktop\\selenium-learning-log\\Day03_XPath//README.txt";
		String file2="C:\\Users\\md  rehan\\OneDrive\\Documents\\CA2_practice//result.txt";
		
		driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys(file1+"\n"+file2);
		
		int size = driver.findElements(By.xpath("//ul[@id='fileList']//li")).size();	
		
		//Validate No Of Files
		if(size==2)
		{
			System.out.println("All Files Are Successfully Uploded");
		}
		
		else
		{
			System.out.println("Files Are Not Uploded Or Incorrect File Uploded");
		}
		
		//Validate Name Of The File
		
		if(driver.findElement(By.xpath("//ul[@id='fileList']//li[1]")).getText().equals("README.txt")
				&&driver.findElement(By.xpath("//ul[@id='fileList']//li[2]")).getText().equals("result.txt"))
				{
			       System.out.println("File Names Are Matched");
				}
		
		else
		{
			System.out.println("Files Names Are Not Matched");
		}
	}

}
