package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class StaleElementException1 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.navigate().to("https://demo.opencart.com/index.php?route=account/register");
		
		WebElement FirstName = driver.findElement(By.id("input-firstname"));
		
		FirstName.sendKeys("Subrahmanya");//v1
		
		driver.navigate().refresh();
		
		//WebElement FirstName = driver.findElement(By.id("input-firstname"));//add this line to overcome stalement
		
		FirstName.sendKeys("Sumanth");//v2

	}

}
