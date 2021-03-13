package DemoOpenCart;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	//By making diver as private we are using Enacpasulation here. private driver is capsulated with public layer and called in run class
	private WebDriver driver;
	
	public WebDriver launchBrowser(String Browser)
	{
		switch (Browser) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
			
		case "FireFox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
			
		case "EDGE":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;

		default:
			System.out.println("Please Enter Valid Browser"+" "+Browser);
			break;
			
		}
		return driver;
		
	}
	
	public void launchURL(String URL)
	{
		driver.get(URL);
	}
	
	public String getPageTitle()
	{
		return driver.getTitle();
	}
	
	public void closeBrowser()
	{
		driver.close();
	}
	
	public void quitBrowser()
	{
		driver.quit();
	}

}
