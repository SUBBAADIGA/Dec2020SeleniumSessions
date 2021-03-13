package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActionClickandSend {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		 By FirstName = By.id("Form_submitForm_FirstName");
		 
	        By sales= By.linkText("CONTACT SALES");
	        
	        Actions act=new Actions(driver);
	        
	        act.sendKeys(driver.findElement(FirstName), "SUBRAHMANYA").build().perform();
	        
	        act.click(driver.findElement(sales)).build().perform();

	}

}
