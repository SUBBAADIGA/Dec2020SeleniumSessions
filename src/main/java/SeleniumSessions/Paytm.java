package SeleniumSessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Paytm {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://paytm.com/");
		
		driver.findElement(By.xpath("//div[@class='_2_g6']/span")).click();
		
		Thread.sleep(3000);
		
		driver.switchTo().frame(driver.findElement(By.xpath("//iframe")));
		
		driver.findElement(By.xpath("//div[@class='watchVideoButton']/span")).click();
		
		
		
		
		driver.findElement(By.xpath("//img[@alt='Metro']"));

	}

}
