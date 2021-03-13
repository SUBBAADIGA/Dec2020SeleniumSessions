package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * This class is having differnt generic methods related to browser.
 * @author sadiga
 *
 */

public class BrowserUtils {
	
	WebDriver driver;
	
	/**
	 * This method is used to initialize webdriver based on given browser name
	 * @param Browser
	 * @return this method return webdriver reference
	 */
	
	public WebDriver launchBrowser(String Browser)
	{
		switch (Browser) {
		
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
				
       case "Firefox":
    	   WebDriverManager.firefoxdriver().setup();
    	   driver=new FirefoxDriver();
			break;

		default:
			System.err.println("Browser is not found"+Browser);
			break;
		}
		return driver;
	}
	/**
	 * 
	 * @param URL
	 */
	
	public void launchUrl(String URL)
	{
		if(URL.isEmpty())
		{
			System.out.println("URL is blank"+" "+URL);
		}
		driver.get(URL);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public String getPageURL()
	{
		return driver.getCurrentUrl();
	}
	
	public void closeBrowse()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}
	
	

}
