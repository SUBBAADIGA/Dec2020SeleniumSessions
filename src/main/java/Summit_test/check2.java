package Summit_test;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class check2 {

	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver=new ChromeDriver();
		driver.get("https://www.orangehrm.com/assets/Documents/OrangeHRM-Privacy-Policy1.pdf");
		Thread.sleep(5000);
		
		System.out.println(driver.getTitle());
		
//		driver.findElement(By.xpath("//a[@class='btn-orange  ']")).click();
//		Set<String> handles = driver.getWindowHandles();
//				
//				Iterator<String> it = handles.iterator();
//				
//				String ParentWindow = it.next();
//				
//				System.out.println("Parent Window handler"+ParentWindow);
//				
//				String ChildWindow=it.next();
//				
//				System.out.println("Child Window handler"+ChildWindow);
//				
//				
//				driver.switchTo().window(ChildWindow);
//				
//				
//				
//				System.out.println(driver.getTitle());

	}

}
