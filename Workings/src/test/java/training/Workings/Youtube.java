package training.Workings;

import java.util.List;

import org.bouncycastle.oer.its.ieee1609dot2.basetypes.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Youtube {
	public static void main(String args[]) throws Exception {
		WebDriver driver;
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		
		driver.get("https://www.youtube.com/");
		driver.manage().window().maximize();
		WebElement searchbutton=driver.findElement(By.xpath("//input[@id='search']"));
		searchbutton.sendKeys("software");
		
		List <WebElement>list =driver.findElements(By.xpath("//li[@role='presentation']//div[@class='sbqs_c']//b"));
		
		System.out.println("the size of list " +list.size());
		for(WebElement listofelements :list ) {
			if(listofelements.getText().equals("software engineering"))
			{
				listofelements.click();
				break;
			}
		}
		
		
	}

}
