package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CaseStudy2 {

	public static void main(String[] args) {
	
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
	
		
///--------------First Window-------------		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		Iterator<String> it = handles.iterator();
		
		String ParentWindow = it.next();
		
		String child1Window=it.next();
		
		driver.switchTo().window(ParentWindow);
		
		System.out.println(driver.getTitle());
		
		driver.switchTo().window(child1Window);
		
	    System.out.println(driver.getTitle());
	
	   driver.close();
	
	driver.switchTo().window(ParentWindow);
	
	System.out.println(driver.getTitle());
	
///--------------Second  Window-------------	
	
	driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
	
	Set<String> handles2 = driver.getWindowHandles();
	Iterator<String> it2 = handles2.iterator();
	
	String Parent2Window = it2.next();
	
	String child2Window=it2.next();
	driver.switchTo().window(Parent2Window);
	
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(child2Window);
	
	System.out.println(driver.getTitle());
	
	driver.close();
	driver.switchTo().window(Parent2Window);
	
	System.out.println(driver.getTitle());
	
	///----------Third Window--------------
	
	driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
	
	Set<String> handles3 = driver.getWindowHandles();
	Iterator<String> it3 = handles3.iterator();
	
	String Parent3Window = it3.next();
	
	String child3Window=it3.next();
	driver.switchTo().window(Parent3Window);
	
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(child3Window);
	
	System.out.println(driver.getTitle());
	
	driver.close();
	driver.switchTo().window(Parent3Window);
	
	System.out.println(driver.getTitle());
	
	
	///---------Fourth window----------
		
	driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
	
	Set<String> handles4 = driver.getWindowHandles();
	Iterator<String> it4 = handles4.iterator();
	
	String Parent4Window = it4.next();
	
	String child4Window=it4.next();
	driver.switchTo().window(Parent4Window);
	
	System.out.println(driver.getTitle());
	
	driver.switchTo().window(child4Window);
	
	System.out.println(driver.getTitle());
	
	driver.close();
	driver.switchTo().window(Parent4Window);
	
	System.out.println(driver.getTitle());
	driver.quit();
	}
	
	

}
