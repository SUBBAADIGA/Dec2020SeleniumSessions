package SelectClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropdown {
	
        static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Industry = By.id("Form_submitForm_Industry");
		
		By Country=By.id("Form_submitForm_Country");
		
		WebelementUtils we=new WebelementUtils(driver);
		
		we.doSelectByValue(Industry, "Education");
		we.doSelectByVisText(Country, "Bosnia and Herzegowina");
		
		

	}
	

}
