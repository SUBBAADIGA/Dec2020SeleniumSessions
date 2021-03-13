package Wait;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import SeleniumSessions.WebelementUtils;
import io.github.bonigarcia.wdm.WebDriverManager;

public class WaitforAlert {

	public static void main(String[] args) {
		
		
        WebDriverManager.chromedriver().setup();
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		
		driver.findElement(By.name("proceed")).click();
		
//		WebDriverWait wait = new WebDriverWait(driver, 10);
//		Alert alert = wait.until(ExpectedConditions.alertIsPresent());
		
		WebelementUtils util=new WebelementUtils(driver);
		
		System.out.println(util.getAlertText());
		util.dissmissalert(10);
		
		
		

	}

}
