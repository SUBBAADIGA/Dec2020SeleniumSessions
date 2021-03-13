package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class SpiceJetMovetoElement {

	public static void main(String[] args)  {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.spicejet.com/");
		
		By LoginButton = By.id("ctl00_HyperLinkLogin");
		
		By Mem=By.linkText("SpiceClub Members");
		
		By Mem_Login=By.linkText("Member Login");
		
		WebelementUtils eu=new WebelementUtils(driver);
		
		eu.doMovetoElement(LoginButton);
		
		eu.doMovetoElement(Mem);
		
		eu.doClick(Mem_Login);
		
		System.out.println(driver.getTitle());
		
	}

}
