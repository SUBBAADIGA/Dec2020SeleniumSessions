package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException4 {

	public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://www.google.co.in/");
		
		List<WebElement> Links = driver.findElements(By.xpath("//span[@id='fsl']/a"));
		
		for(int i=0;i<Links.size();i++)
		{
		    Links.get(i).click();
		  System.out.println(driver.getTitle());  
		    driver.navigate().back();
		    Links = driver.findElements(By.xpath("//span[@id='fsl']/a"));

	    }

}
}
