package training.Workings;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Table {
	public static void main(String args[]) throws InterruptedException
	{
		
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://selenium.obsqurazone.com/table-pagination.php");
		driver.manage().window().maximize();
	int  rows=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tr")).size();
	int columns=driver.findElements(By.xpath("//table[@id='dtBasicExample']//tbody//tr")).size();
	System.out.println(rows);
	System.out.println(columns);
	
	String value=driver.findElement(By.xpath("//table[@id='dtBasicExample']//tbody//tr//td[text()='Ashton Cox']")).getText();
	System.out.println(value);
	String value2="Ashton Cox";

	driver.close();
		
		
	}

}

