package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WebdriverFirefox {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver", "C:\\Users\\sadiga\\Desktop\\Drivers\\geckodriver.exe");
	WebDriver driver=new FirefoxDriver();
	
	driver.get("https://github.com/mozilla/geckodriver/releases/tag/v0.29.0");

	}

}
