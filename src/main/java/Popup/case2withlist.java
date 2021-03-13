package Popup;

import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class case2withlist {

	public static void main(String[] args) {
		
       WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://opensource-demo.orangehrmlive.com/");
		
		driver.findElement(By.xpath("//img[@alt='LinkedIn OrangeHRM group']")).click(); 
		
		Set<String> handles = driver.getWindowHandles();
		ArrayList<String> handlelist = new ArrayList<String>(handles);
		
		String ParentWindow = handlelist.get(0);
		String ChildWindow=handlelist.get(1);
		
		//--------Switching to first child		
		
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		driver.switchTo().window(ChildWindow);
		System.out.println(driver.getTitle());
		driver.close();
		
		//--------Switching to second child 
		driver.switchTo().window(ParentWindow);
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on Facebook']")).click();
		
		Set<String> handles2=driver.getWindowHandles();
		ArrayList<String> handleslist2 = new ArrayList<String>(handles2);
		
		//String parentWindow2 =handleslist2.get(0);
		
		String Childwindow2=handleslist2.get(1);
		driver.switchTo().window(Childwindow2);
		System.out.println(driver.getTitle());
		driver.close();
		
		//--------Switching to third child 
		
		driver.switchTo().window(ParentWindow);
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on twitter']")).click();
		
		Set<String> handles3=driver.getWindowHandles();
		ArrayList<String> handlelist3 = new ArrayList<String>(handles3);
		
		String childWindow3=handlelist3.get(1);
		
		driver.switchTo().window(childWindow3);
		System.out.println(driver.getTitle());
		driver.close();
		
		//--------Switching to fourth child 
		driver.switchTo().window(ParentWindow);
		
		driver.findElement(By.xpath("//img[@alt='OrangeHRM on youtube']")).click();
		
		Set<String> handles4 = driver.getWindowHandles();
		
		ArrayList<String> handlelist4 = new ArrayList<String>(handles4);
		
		String childWindow4 = handlelist4.get(1);
		driver.switchTo().window(childWindow4);
		System.out.println(driver.getTitle());
		driver.close();
		driver.switchTo().window(ParentWindow);
		System.out.println(driver.getTitle());
		driver.quit();
		
		
		
		
		
		
		
		
		
	}

}
