package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException3 {

	public static void main(String[] args) {
		
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		
		List<WebElement> RightOptions = driver.findElements(By.xpath("//div[@class='list-group']/a"));
		
		for(int i=1;i<RightOptions.size();i++)
		{
			RightOptions.get(i).click();
			driver.navigate().refresh();//v1
			driver.navigate().forward();
			driver.navigate().refresh();
			RightOptions = driver.findElements(By.xpath("//div[@class='list-group']/a"));//v2
		}
		

	}

}
