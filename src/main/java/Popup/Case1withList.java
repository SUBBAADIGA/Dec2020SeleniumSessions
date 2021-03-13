package Popup;

import java.awt.List;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Case1withList {

	public static void main(String[] args) {
		
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); 
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String>handles=driver.getWindowHandles();
		
	 ArrayList<String> handleList = new ArrayList<String>(handles);
		
			String ParentWindow = handleList.get(0);
			String ChildWindow1=handleList.get(1);
			String ChildWindow2=handleList.get(2);
			String ChildWindow3=handleList.get(3);
			String ChildWindow4=handleList.get(4);
			
			//--------Switching to Parent window
			driver.switchTo().window(ParentWindow);
			System.out.println(driver.getTitle());
			
			
			//--------Switching to first window
			driver.switchTo().window(ChildWindow1);
			System.out.println(driver.getTitle());
			driver.close();
		
			//--------Switching to second window
			driver.switchTo().window(ChildWindow2);
			System.out.println(driver.getTitle());
			driver.close();
			
			//--------Switching to third window
			driver.switchTo().window(ChildWindow3);
			System.out.println(driver.getTitle());
			driver.close();
			
			//--------Switching to fourth window
			driver.switchTo().window(ChildWindow4);
			System.out.println(driver.getTitle());
			
			driver.switchTo().window(ParentWindow);
			System.out.println(driver.getTitle());
			driver.quit();
		

	}

}
