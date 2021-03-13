package Popup;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptPopuphandle {

	public static void main(String[] args) throws InterruptedException {
		
		
		//Java Script Popup Handle or Alert or modal dialog pop ups
		//alert methods in JS
		//alert('hi this is my popup')
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
		Thread.sleep(2000);
		
		//to come from webapplication to alert
		Alert alert = driver.switchTo().alert();
		
		System.out.println(alert.getText());
		
		//accept the alert
		alert.accept();  //Click on OK/Submit/Yes Button
		
		//alert.dismis();  dismiss the alert	
		
		//to come from alert to webapplication
		driver.switchTo().defaultContent();

	}

}
