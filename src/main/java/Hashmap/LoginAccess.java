package Hashmap;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginAccess {
	static WebDriver driver;

	public static void main(String[] args) {
	     //Admin,Customer,Vendor,Manager,Distributor.
		//RBAC-->> Role Based Access Control
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		doLogin("Manager");
		doLogin("Admin");
			
	}
	
	public static void doLogin(String role)
	{
	    String[] Cred = getCredentialMap(role).split(":");
	    
//		By EmailID = By.id("input-email");
//		By Password=By.id("input-password");  
//		By SIGNIN=By.xpath("//input[@value='Login']");
	    
		By EmailID = By.id("txtLogin");
		By Password=By.id("txtPassword");
		By SIGNIN=By.id("butSubmit");
		
		driver.findElement(EmailID).clear();
		driver.findElement(EmailID).sendKeys(Cred[0]);
		driver.findElement(Password).clear();
		driver.findElement(Password).sendKeys(Cred[1]);
		driver.findElement(SIGNIN).click();
	}
	
	public static String getCredentialMap(String role)
	{
		Map<String, String> credmap=new HashMap<String,String>();
		credmap.put("Admin", "admin@test.com:test@123");
		credmap.put("Customer", "customer@test.com:test@124");
		credmap.put("Vendor", "vendor@test.com:test@126");
		credmap.put("Manager", "manager@test.com:test@128");
		credmap.put("USER", "subrahmanya.adiga@symphonysummit.com:test@123");

		
		if(credmap.containsKey(role))
		{
			return credmap.get(role);
		}
		return null;
	}

}
