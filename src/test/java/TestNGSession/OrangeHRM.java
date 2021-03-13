package TestNGSession;

import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrangeHRM extends BaseTest {
	
	
	@Test(priority = 1,enabled = true)
	public void TitleTest() throws InterruptedException
	{
		String Title = driver.getTitle();
		Thread.sleep(2000);
		
		Assert.assertEquals(Title, "Free Human Resource Management Software | 30 Day Trial Creation");
	}
	
	@Test(priority = 2,enabled = true)
	public void getLinkCountTest()
	{
		List<WebElement> Links = driver.findElements(By.xpath("//ul[@class='nav navbar-nav navbar-left default-nav']//a"));
		Assert.assertEquals(Links.size(), 6);
	}
	
	@Test(priority=3,enabled = true)
	public void FilformTest()
	{
		driver.findElement(By.xpath("//input[@id='Form_submitForm_FirstName']")).sendKeys("Subrahmanya");
		driver.findElement(By.xpath("//input[@id='Form_submitForm_LastName']")).sendKeys("Adiga");
		driver.findElement(By.xpath("//input[@id='Form_submitForm_Email']")).sendKeys("Subbaadiga@test.com");
		driver.findElement(By.xpath("//input[@id='Form_submitForm_JobTitle']")).sendKeys("QA");
		Select select=new Select(driver.findElement(By.xpath("//select[@id='Form_submitForm_NoOfEmployees']")));
		select.selectByVisibleText("76 - 100");
		
	}
	
	@Test(priority = 4,enabled = true)
	public void PrivacyPolicyTest() throws InterruptedException
	{
		driver.findElement(By.xpath("//a[@class='btn-orange  ']")).click();
        Set<String> handles = driver.getWindowHandles();
		
		Iterator<String> it = handles.iterator();
		
		String ParentWindow = it.next();
		
		System.out.println("Parent Window handler"+ParentWindow);
		
		String ChildWindow=it.next();
		
		System.out.println("Child Window handler"+ChildWindow);
		
		
		driver.switchTo().window(ChildWindow);
		
		Assert.assertEquals(driver.getTitle(), "PrivacyPolicyTest");
	}
	

	

}
