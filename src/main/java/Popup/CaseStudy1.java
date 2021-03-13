package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseStudy1 {

	public static void main(String[] args) { 
		
	       WebDriverManager.chromedriver().setup();
			
			WebDriver driver=new ChromeDriver();
			
			driver.get("https://opensource-demo.orangehrmlive.com/");
			
			driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); 
			driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
			driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
			driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
			
			Set<String>handles=driver.getWindowHandles();
			
			Iterator<String> it = handles.iterator();
			
			String Parent = it.next();
			String child1 = it.next();
			String child2 = it.next();
			String child3 = it.next();
			String child4 = it.next();
		////---------Moving to parent window	
			driver.switchTo().window(Parent);
			System.out.println(driver.getTitle());
			
	///-------------Moving to second window		
			driver.switchTo().window(child1);
			System.out.println(driver.getTitle());
			driver.close();
			
    //----------Moving to second child	
			driver.switchTo().window(child2);
			System.out.println(driver.getTitle());
			driver.close();
	//---------Moving to third child
			
			driver.switchTo().window(child3);
			System.out.println(driver.getTitle());
			driver.close();
	///------Moving to fourth child
			
			driver.switchTo().window(child4);
			System.out.println(driver.getTitle());
			driver.close();
			
	//-------Moving to Parent 
			driver.switchTo().window(Parent);
			System.out.println(driver.getTitle());
			driver.quit();
			
	}

}
