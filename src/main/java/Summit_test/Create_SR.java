package Summit_test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Hashmap.LoginAccess;
import SeleniumSessions.BrowserUtils;
import SeleniumSessions.WebelementUtils;

public class Create_SR {

	public static void main(String[] args) throws InterruptedException {
		
		BrowserUtils br=new BrowserUtils();
		
		WebDriver driver = br.launchBrowser("chrome");
		
		driver.manage().window().maximize();
		
		br.launchUrl("https://qademo.symphonysummit.com:8084/DENALISP3HF01/Summit_WebLogin.aspx#!");
		
		WebelementUtils util=new WebelementUtils(driver);
		
		By EmailID = By.id("txtLogin");
		By Password=By.id("txtPassword");
		By SIGNIN=By.id("butSubmit");
		By New_SR=By.id("SR_LOGSR");
		By Duplicate=By.xpath("//div[text()='Duplicate Login']");
		By Frame=By.id("SPopUp-frame");
		
		
		
		
		///Home page locators
		By Menu = By.xpath("//span[@class='nav-exp-col-icon fa fa-th']");
		By RequestModule=By.xpath("//span[@id='SR']");
		
		
		
		//New SR page
		By Tenant=By.xpath("//option[text()='SR Tenant']");
		By ExpandCategory=By.xpath("//a[text()='EMail to SR Catalogs']/parent::li/i");
		By Selectcatalog=By.xpath("//a[text()='Plain catalog']");
		By Remarks=By.id("BodyContentPlaceHolder_txtRemarks");
		By Submit=By.id("BodyContentPlaceHolder_btnSave");
		By ClickMySRBut=By.xpath("//button[text()='MY SERVICE REQUESTS']");
		
		
		
//		util.doSendKeys(EmailID, "subrahmanya.adiga@symphonysummit.com");
//		util.doSendKeys(Password, "test@123");
//		util.doActionsClick(SIGNIN);
		
		util.doLogin("Subrahmanya", EmailID, Password, SIGNIN);
		
		
		 List<WebElement> check = util.waitForVisibilityofElements(Duplicate, 10);
		 
		if( check.size()==0)
		
			{
			  driver.switchTo().frame("SPopUp-frame");
				
				driver.findElement(By.xpath("//input[@type='submit']")).click();
				
		 		driver.switchTo().defaultContent();
		   }
		
		
		Thread.sleep(2000);
		
		
		util.doActionsClick(Menu);
		util.doMovetoElement(RequestModule);
		Thread.sleep(2000);
		util.doActionsClick(RequestModule);
		util.doActionsClick(New_SR);
		
		util.waitVisibilityofElement(Tenant, 15).click();
		
		
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1000)");
		
		util.waitforPresenceOfElement(ExpandCategory, 15).click();
		util.waitforPresenceOfElement(Selectcatalog, 20);
		
		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(Selectcatalog));
		util.doActionsClick(Selectcatalog);
		
		//util.waitforPresenceOfElement(Selectcatalog, 20).click();
		
//		wait.until(ExpectedConditions.presenceOfElementLocated(ExpandCategory));
//		
//		util.doActionsClick(ExpandCategory);
		
//	wait.until(ExpectedConditions.presenceOfElementLocated(Selectcatalog));
		
//		js.executeScript("arguments[0].scrollIntoView();", driver.findElement(Selectcatalog));
//		util.doActionsClick(Selectcatalog);
//		
//		Thread.sleep(2000);
		
		util.doActionSendKeys(Remarks, "Hello testing SR By JAVA SELENIUM");
		
		util.doActionsClick(Submit);
		
		Thread.sleep(3000);
		
		String SR_No=driver.findElement(By.xpath("//label[text()='Service Request ID - ']/parent::div")).getText();
		
		
		
		String SRID = SR_No.substring(21);
		
		//My SR Page
		By MYSRID=By.xpath("//a[text()='"+SRID+"']");
		
		By CheckSRID = By.xpath("//span[@id='BodyContentPlaceHolder_lblRequestNo']");
		
		System.out.println(SRID);
		
		util.doActionsClick(ClickMySRBut);
		
		Thread.sleep(2000);
		
		util.doActionsClick(MYSRID);
		
		Thread.sleep(2000);
		
		if(util.doGetElementText(CheckSRID).equals(SRID))
				{
			         System.out.println("Correct SR ID IS DISPLAYED");
				}
		

	}

}
