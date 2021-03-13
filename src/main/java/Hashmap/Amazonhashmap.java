package Hashmap;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amazonhashmap {

	static WebDriver driver;

public static void main(String[] args) {

		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://www.amazon.in/Samsung-Galaxy-Storage-Triple-Camera/dp/B08RSY2653/ref=sr_1_1?dchild=1&keywords=samsung+mobile&qid=1613492008&s=kitchen&sr=1-1");
		
		int rowcount=driver.findElements(By.xpath("//table[@id='productDetails_techSpec_section_1']//tr")).size();
		String headerXpath="//table[@id='productDetails_techSpec_section_1']//th";
		String tabledataXpath="//table[@id='productDetails_techSpec_section_1']//tr/th/following-sibling::td";
		
		List<WebElement> headerList = driver.findElements(By.xpath(headerXpath));
		List<WebElement> tableDatalist = driver.findElements(By.xpath(tabledataXpath));
		
		if(headerList.size()==tableDatalist.size())
		{
			Map<String, String> Tchinfo=new HashMap<String,String>();
			
			ArrayList<String> key=new ArrayList<String>();
			
			ArrayList<String> value=new ArrayList<String>();
			
			for(WebElement e:headerList)
			{
				key.add(e.getText());
				
			}
			
			for(WebElement e2:tableDatalist)
			{
				value.add(e2.getText());
			}
			
			for(int i=0;i<key.size();i++)
			{
				for(int j=0;j<=i;j++)
				{
					Tchinfo.put(key.get(i), value.get(j));
					
				}
			}
			System.out.println(Tchinfo.get("Batteries"));
			System.out.println(Tchinfo.get("Manufacturer"));
			System.out.println(Tchinfo.get("Display technology"));
						
		}	
		
	}

}
