package SeleniumSessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AutomationPracticeSearch {

	public static void main(String[] args) throws InterruptedException {
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://automationpractice.com/index.php");
		
		By Search_field = By.id("search_query_top");
		
		driver.findElement(Search_field).sendKeys("Dress");
		
		Thread.sleep(3000);
		
	List<WebElement> suggessionlist = driver.findElements(By.xpath("//div[@class='ac_results']//li"));
		
		for(WebElement e:suggessionlist)
		{
			System.out.println(e.getText());
			
			if(e.getText().equals("T-shirts > Faded Short Sleeve T-shirts"))
			{
				e.click();
				break;
			}
		}
		
		WebElement text = driver.findElement(By.xpath("//div[@class='pb-center-column col-xs-12 col-sm-4']/h1"));
		
		System.out.println(text.getText());
		
		if(text.getText().equals("Faded Short Sleeve T-shirts"))
		{
			System.out.println("Item is present");
		}

		
		

	}

}
