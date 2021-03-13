package Dynamic_tables;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Cricinfo_ESPN {
	
	static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {
   
		
		WebDriverManager.chromedriver().setup();
        
		 driver=new ChromeDriver();
		
		driver.get("https://www.espncricinfo.com/series/england-tour-of-india-2020-21-1243364/india-vs-england-2nd-test-1243385/full-scorecard");
		
		
//		String xpathval="(//a[text()='Shubman Gill']/parent::td/following-sibling::td[@class='text-left'])[2]";
//		
//	   System.out.println(driver.findElement(By.xpath(xpathval)).getText());
		
		List<WebElement> ScoreList = driver.findElements(By.xpath("//a[text()='Rohit Sharma']/parent::td/following-sibling::td"));
		
		for(WebElement e:ScoreList)
		{
			System.out.println(e.getText());
		}
			
		
		//getWkttkr("Shubman Gill");
		
		
	

	}
	
	public static void getWkttkr(String Batsman)
	{
	
	 System.out.println(driver.findElement(By.xpath("(//a[text()='"+Batsman+"']/parent::td/following-sibling::td[@class='text-left'])[2]")).getText());
	   
	}
	
	

}
