package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinkswithattribute {

	public static void main(String[] args) {
		//Get total links
		//print all href values of all the links having no blank text.
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		List<WebElement> linktext = driver.findElements(By.tagName("a"));
		
		System.out.println(linktext.size());
		
		for(WebElement e:linktext)
		{
			
			
			if(!e.getText().isEmpty())
			{
				String url = e.getAttribute("href");
				if(url!=null)
				{
					System.out.println(url);
				}
				
			}
			
		}
		
	}

}
