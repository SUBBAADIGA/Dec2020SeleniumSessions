package Popup;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AuthPopuphandle {

	public static void main(String[] args) {


		WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		//Actual URL> https://the-internet.herokuapp.com/basic_auth
		
	//	driver.get("https://admin:admin@the-internet.herokuapp.com/basic_auth");
		
		String username="admin";
		String passWord="admin";
		
		driver.get("https://"+username+ ":"+passWord+ "@"+"admin:admin@the-internet.herokuapp.com/basic_auth");
		//  "+username+ ":"+passWord+ "@"+"
		
		

	}

}
