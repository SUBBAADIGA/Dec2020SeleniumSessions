package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class FreshworkFooterlinks {

	public static void main(String[] args) throws InterruptedException {
		
		
		BrowserUtils br=new BrowserUtils();
		br.launchBrowser("chrome");
		
		By Foot = By.xpath("//div[@class='footer-main']//a");
		WebelementUtils el=new WebelementUtils(br.driver);
		
		br.launchUrl("https://www.freshworks.com/");
	
		
		List<WebElement> Footerlinks = el.getElements(Foot);
		System.out.println(Footerlinks.size());
		
		for(WebElement e:Footerlinks)
		{
			System.out.println(e.getText()+"---"+e.getAttribute("href"));
		}
		
		
	}

}
