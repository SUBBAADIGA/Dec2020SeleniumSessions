package Wait;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WebdriverWait {

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By Email=By.name("email");
		By Password=By.name("password");
		By options=By.cssSelector(".list-group a");
		
//		//First Approach
//		//new WebDriverWait(driver, timeOutInSeconds)
//		
//		WebDriverWait wait=new WebDriverWait(driver, 10);
//		
//		/**
//		 * An expectation for checking that an element is present on the DOM of a page. 
//		 * This does notnecessarily mean that the element is visible.
//          Parameters:locator used to find the elementReturns:the WebElement once it is located
//		 */
//		WebElement ele = wait.until(ExpectedConditions.presenceOfElementLocated(Email));
//		
//		ele.sendKeys("test@test.com");
//		
//		//Second Approach
//		//new WebDriverWait(driver, timeOutInSeconds, sleepInMillis)
//		//By default in selenium 500 miliseconds is interval.
//		//WebDriverWait wait1=new WebDriverWait(driver, 10, 2);
		
		WebelementUtils util=new WebelementUtils(driver);
		
//		util.waitforPresenceOfElement(Email, 10).sendKeys("subba@test.com");
//		util.getElement(Password).sendKeys("test@123");

		util.waitVisibilityofElement(Email, 10).sendKeys("subbaadiga@test.com");
		
		util.waitForVisibilityofElements(options, 12).
		stream().forEach(ele->System.out.println(ele.getText()));
		
		
		
		
		
		
		

	}

}
