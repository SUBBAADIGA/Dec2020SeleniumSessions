package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropvalueWithText {
	
	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		By Industry = By.id("Form_submitForm_Industry");
		
		By Country=By.id("Form_submitForm_Country");
		
		
//		Select select=new Select(driver.findElement(Industry));
//		
//		List<WebElement> optionlist = select.getOptions();
//		
//		for(WebElement e:optionlist)
//		{
//			if(e.getText().equals("Electronics"))
//			{
//				e.click();
//				break;
//			}
//		}		
		
		WebelementUtils util=new WebelementUtils(driver);
		
		util.doSelectdropwithtext(Country, "Bermuda");
			

	}

}
