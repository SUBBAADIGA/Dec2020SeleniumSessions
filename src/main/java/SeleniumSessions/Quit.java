package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Quit {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\sadiga\\Desktop\\Drivers\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		
		driver.get("https://www.amazon.in/");
		
		String URL=driver.getCurrentUrl();
		
		driver.quit();//Till here it will same session ID
		
		String tit=driver.getTitle();  //FirefoxDriver: firefox on WINDOWS (null)
		
		

	}

}
