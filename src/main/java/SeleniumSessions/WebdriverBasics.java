package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebdriverBasics {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadiga\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://qademo.symphonysummit.com/DENALISP3HF01/Summit_WebLogin.aspx#!");
		
		String title = driver.getTitle();
				
				System.out.println(title);
		if(title.equals("Login.."))
		{
			System.out.println("Title is correct");
		}
		else
		{
			System.out.println("Title is not correct");
		}
	}

}
