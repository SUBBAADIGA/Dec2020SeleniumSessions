package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitForTitle {

	public static void main(String[] args) {
		
		  WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://www.hubspot.com/");
	
			WebelementUtils util=new WebelementUtils(driver);
			
			By Login=By.xpath("//a[text()='Log in']");
			
			By Allowcokie=By.xpath("//a[@id='hs-eu-confirmation-button']");
			
			util.waitforPresenceOfElement(Allowcokie, 10).click();
			
			util.waitforPresenceOfElement(Login, 10).click();
			
			System.out.println(util.waitForTitle("HubSpot Login", 15));

	}

}
