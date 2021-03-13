package ActionsClass;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RightclickConcept {

	public static void main(String[] args)  {
		
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("https://swisnl.github.io/jQuery-contextMenu/demo/input.html");
		
		WebElement rightclickme = driver.findElement(By.className("context-menu-one"));
		
		WebElement Radio2 = driver.findElement(By.xpath("//input[@value='2']"));
		
		Actions act=new Actions(driver);
		
		
		act.contextClick(rightclickme).perform();
		
		List<WebElement> options = driver.findElements(By.xpath("//ul[@class='context-menu-list context-menu-root']//span"));
		
		
		for(WebElement e:options)
		{
			System.out.println(e.getText());
		}
		System.out.println("---------------------");
		for(int i=0;i<options.size();i++)
		{
			System.out.println(options.get(i).getText());
		}
		
		
		
		act.click(Radio2).build().perform();
		
		
		
		
	}
}

