package SelectClass;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropdownOptions {
	static WebDriver driver;
	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.orangehrm.com/orangehrm-30-day-trial/");
		
	   By Industry = By.id("Form_submitForm_Industry");
	   
	   List<WebElement> IndusList = getOPtionslist(Industry);
	   
	  System.out.println(IndusList.contains("Travel")); 	

	}
	
	public static WebElement getElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public static List<WebElement> getOPtionslist(By locator)
	{
		Select select=new Select(getElement(locator));
		
		List<String> optionlistText=new ArrayList<String>();
		
		List<WebElement> optionlist = select.getOptions();
		System.out.println(optionlist.size());
		
		for(WebElement e:optionlist)
		{
			optionlistText.add(e.getText());
		}
		return optionlist;	
	}
	}


