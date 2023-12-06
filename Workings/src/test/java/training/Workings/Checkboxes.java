package training.Workings;



import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboxes {
	public static void main(String args[]) throws Throwable 
	{
	
	
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://demo.guru99.com/test/radio.html");
		driver.manage().window().maximize();
		//driver.findElement(By.xpath("//input[@id='vfb-6-0']")).click();
	List<WebElement>checkboxlist=driver.findElements(By.xpath("//input[@type='checkbox']"));
	System.out.println(checkboxlist.size());
	/*for(WebElement check:checkboxlist)
	{
		String checkboxname=check.getAttribute("value");
		if(checkboxname.equals("checkbox1")||checkboxname.equals("checkbox3"))
		{
			
			check.click();
		}
	}*/
	
	int noofcheckboxes=checkboxlist.size();
	System.out.println(noofcheckboxes);
	for(int i=noofcheckboxes-1;i<noofcheckboxes;i++)
	{
		checkboxlist.get(i).click();
	}
	Thread.sleep(1000);
		driver.close();
		
	}

}
