package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonlaunch2 {
  static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/ap/signin?openid.pape.max_auth_age=0&openid.return_to=https%3A%2F%2Fwww.amazon.in%2F%3Fref_%3Dnav_ya_signin&openid.identity=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.assoc_handle=inflex&openid.mode=checkid_setup&openid.claimed_id=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0%2Fidentifier_select&openid.ns=http%3A%2F%2Fspecs.openid.net%2Fauth%2F2.0&");
		
		//ID
//		driver.findElement(By.id("ap_email")).sendKeys("subbaadiga@gmail.com");
//		driver.findElement(By.id("continue")).click();
//		driver.findElement(By.id("ap_password")).sendKeys("Test@123");
		
		
		//By Locators
		By EmailID = By.id("ap_email");
		By Password = By.id("ap_password");
		By Continue = By.className("\"a-button a-button-span12 a-button-primary\"");
		
		doSendKeys(EmailID, "subbaadiga@gmail.com");
		driver.findElement(Continue);
		doSendKeys(Password, "test@123");
		
		
		
		
	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static void doSendKeys(By locator,String value)
	{
		getElement(locator).sendKeys(value);
	}
	
	

}
