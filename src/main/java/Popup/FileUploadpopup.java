package Popup;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FileUploadpopup {

	public static void main(String[] args) {
	
		
		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://cgi-lib.berkeley.edu/ex/fup.html");
		
		WebElement Attachfile = driver.findElement(By.name("upfile"));
		Attachfile.sendKeys("C:\\Users\\sadiga\\Desktop\\Denali_Scrennshots\\1.png");
	}

}
