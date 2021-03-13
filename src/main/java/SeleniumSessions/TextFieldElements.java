package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class TextFieldElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		BrowserUtils br=new BrowserUtils();
		br.launchBrowser("chrome");
		br.launchUrl("https://demo.opencart.com/index.php?route=account/register");
		
		WebelementUtils el=new WebelementUtils(br.driver);
		
		By textfileds = By.xpath("//input[@class='form-control']");
		By login = By.linkText("Login");
		
		List<WebElement> Formlist = el.getElements(textfileds);
		if(Formlist.size()==6)
		{
			System.out.println("All fields ar epresent");
		}
		if(el.doIsDisplayed(login))
		{
			System.out.println("Login is present");
		}
		if(el.getElements(login).size()==1)
		{
			System.out.println("Login is present");
		}
		
		for(WebElement e:Formlist)
		{
			e.sendKeys("Testing");
		}
		
		
		

	}

}
