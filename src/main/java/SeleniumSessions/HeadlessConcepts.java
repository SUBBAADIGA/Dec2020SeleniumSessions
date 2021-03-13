package SeleniumSessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HeadlessConcepts {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		//Headless no browser
		//testing is happening behind the scence.
		
//		ChromeOptions co=new ChromeOptions();
//		co.addArguments("--headless");
//		WebDriver driver=new ChromeDriver(co);
		
		//for incognito
		
	ChromeOptions co=new ChromeOptions();
	co.addArguments("--incognito");
	WebDriver driver=new ChromeDriver(co);
		
	driver.navigate().to("https://www.google.co.in/");
		
		System.out.println(driver.getTitle());

	}

}
