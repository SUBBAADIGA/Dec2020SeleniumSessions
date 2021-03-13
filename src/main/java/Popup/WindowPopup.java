package Popup;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class WindowPopup {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click();
		
		Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String ParentWindow = it.next();
		
		System.out.println("Parent Window handler"+ParentWindow);
		
		String ChildWindow=it.next();
		
		System.out.println("Child Window handler"+ChildWindow);
		
		driver.switchTo().window(ChildWindow);
		
		System.out.println(driver.getTitle());
		
		driver.close();
		
		driver.switchTo().window(ParentWindow);
		
		System.out.println(driver.getTitle());
		
		driver.quit();
		
		

	}

}
