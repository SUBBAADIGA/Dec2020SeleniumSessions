package Dynamic_tables;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Dynamic_Webtable {
	
	
	static WebDriver driver;
	static Actions act;
	public static void main(String[] args) throws InterruptedException {
		
		
		WebDriverManager.chromedriver().setup();
		
		 driver=new ChromeDriver();
		
		driver.get("https://ui.cogmento.com");
		
		driver.findElement(By.xpath("//input[@name='email']")).sendKeys("subbaadiga@gmail.com");;
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("Sub%3322@");
		driver.findElement(By.xpath("//div[text()='Login']")).click();
		Thread.sleep(3000);
		 act=new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//span[text()='Contacts']"))).build().perform();
		driver.findElement(By.xpath("//span[text()='Contacts']")).click();
		
	    Thread.sleep(3000);
	
		//String val="//a[text()='Swasthik bhat']/parent::td/preceding-sibling::td//input[@type='checkbox']";
		
		//act.click(driver.findElement(By.xpath(val))).perform();
	    
	    SelectContact("sumanta adiga");
	    SelectContact("Swasthik bhat");
	    
	    Thread.sleep(3000);
	    
	    driver.close();		

	}
	
	public static void SelectContact(String name)
	{
		String xpath="//a[text()='"+name+"']/parent::td/preceding-sibling::td//input[@type='checkbox']";
		System.out.println(xpath);
		act.click(driver.findElement(By.xpath(xpath))).perform();
	}

}
