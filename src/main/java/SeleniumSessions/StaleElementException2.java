package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class StaleElementException2 {

	public static void main(String[] args) {
		
		BrowserUtils br=new BrowserUtils();
		
		br.launchBrowser("chrome");
		
		WebDriver driver=br.driver;
		
		By FirstName = By.id("input-firstname");
		
		WebelementUtils eut=new WebelementUtils(driver);
		
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		eut.getElement(FirstName).sendKeys("Subrahmanya");
		
		driver.navigate().refresh();
		
		eut.getElement(FirstName).sendKeys("Subrahmanya Adiga");
		
		
		
		
	
	}

}
