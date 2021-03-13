package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MoveToElementActionclass {
	
	
	public static void main(String[] args) {

		
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("http://mrbool.com/");
		
		Actions act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.className("menulink"))).perform();
		
		
	}
	

	
}
