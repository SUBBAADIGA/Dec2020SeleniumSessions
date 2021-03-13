package ActionsClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DragandDrop {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		
		 WebDriver driver = new ChromeDriver();
		
		driver.get("http://jqueryi.com/resources/demos/droppable/default.html");
		
		 WebElement source = driver.findElement(By.id("draggable"));
		WebElement destination =driver.findElement(By.id("droppable"));
		
		Actions act=new Actions(driver);
		
		act.dragAndDrop(source,destination).build().perform();
	}

}
