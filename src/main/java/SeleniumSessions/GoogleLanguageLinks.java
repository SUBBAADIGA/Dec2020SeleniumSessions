package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLanguageLinks {
static WebDriver driver;
	public static void main(String[] args) {
	
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		By langlinks = By.xpath("//div[@id='SIvCob']/a");
		doLinkClick(langlinks, "मराठी");
	}

	public static List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public static void doLinkClick(By locator,String value)
	
	{
        List<WebElement> langlinks = getElements(locator);
		
		System.out.println(langlinks.size());
		
		for(WebElement e:langlinks)
		{
			String txt=e.getText();
			System.out.println(txt);
			if(txt.equals(value))
			{
				e.click();
				break;
			}
		}
	}

}
