package training.Workings;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowHandles {
	public static void main(String args[])
	{
		WebDriver driver;
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/");
		driver.manage().window().maximize();
		String id=driver.getWindowHandle();
		System.out.println(id);
		
		driver.findElement(By.xpath("//a[text()='Watch the Videos']")).click();
		Set<String>WindowsId=driver.getWindowHandles();
		//using iterator method 
		Iterator<String> parentandchildId=WindowsId.iterator();
		String parentid=parentandchildId.next();
		String childid=parentandchildId.next();
		System.out.println(parentid);
		System.out.println(childid);
		//list method retrieving the data 
		List<String> listId=new ArrayList(WindowsId);
		listId.get(0);
		listId.get(1);
		
		
	}

}
