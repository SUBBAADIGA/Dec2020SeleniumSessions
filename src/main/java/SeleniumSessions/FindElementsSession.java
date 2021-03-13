 package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FindElementsSession {

	public static void main(String[] args) {
		
		
		//find out all the links on the page
		//link count-total links on the page
		//print the text value of each link
		//But ignore the blank text
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/register");
		
		List<WebElement> linklist=driver.findElements(By.tagName("a"));
		
		System.out.println(linklist.size());
		
		for(int i=0;i<linklist.size();i++)
		{
			String linkText = linklist.get(i).getText();
			
			if(!linkText.isEmpty()) {
			System.out.println(i+"-->"+linkText);
			}
		}

	}

}
