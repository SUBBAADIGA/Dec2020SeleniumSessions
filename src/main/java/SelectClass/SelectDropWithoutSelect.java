package SelectClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SelectDropWithoutSelect {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
		
		By Indusx = By.xpath("//select[@id='Form_submitForm_Industry']/option");
//		
//		List<WebElement> Induslist = driver.findElements(Indusx);
//		
//		for(WebElement e:Induslist)
//		{
//			if(e.getText().equals("Education"))
//			{
//				e.click();
//				break;
//			}
//		}
//	}//need to add to utils
	
		WebelementUtils util=new WebelementUtils(driver);
		util.doSelectWithoutSelect(Indusx, "Electronics");
	

}
}
