package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class QuitVSClose {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\sadiga\\Desktop\\Drivers\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/");
		
		String URL=driver.getCurrentUrl();
		System.out.println(URL);
		
		driver.close();//same session ID as above
		
		
		String tit = driver.getTitle();  ////same session ID as above but it will be invalid Exception in thread "main" org.openqa.selenium.NoSuchSessionException: invalid session id
		System.out.println(tit);

	}

}
