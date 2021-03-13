package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleSearchHandle {

	public static void main(String[] args) throws InterruptedException {
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.google.co.in/");
		
		By Search_field = By.name("q");
		
		driver.findElement(Search_field).sendKeys("Naveen Automation labs");
		
		Thread.sleep(3000);
		
		List<WebElement> suggessionlist = driver.findElements(By.xpath("//ul[@class='erkvQe']//div[@class='sbl1']//span"));
		
		for(WebElement e:suggessionlist)
		{
			System.out.println(e.getText());
			if(e.getText().equals("naveen automation labs youtube"))
			{
				e.click();
				break;
			}
		}
		
		
	}

}
