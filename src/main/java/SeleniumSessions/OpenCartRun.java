package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class OpenCartRun {

	public static void main(String[] args) {
		BrowserUtils br=new BrowserUtils();
		WebDriver driver = br.launchBrowser("Firefox");
		
		
		WebelementUtils we=new WebelementUtils(driver);
		br.launchUrl("https://demo.opencart.com/index.php?route=account/login");
		
		By Email = By.id("input-email");
		By Password = By.id("input-password");
		By Login = By.xpath("//*[@id=\"content\"]/div/div[2]/div/form/input");
		
		we.doSendKeys(Email, "subbaadiga@gmail.com");
		we.doSendKeys(Password, "test@123");
		we.doClick(Login);
		
		String title = br.driver.getTitle();
		System.out.println(title);
		
		br.closeBrowse();
	
		
		
		
		

	}

}
