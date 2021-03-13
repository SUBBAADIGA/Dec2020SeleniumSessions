package SeleniumSessions;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WebelementUtils {
	private WebDriver driver;
	private Actions act;
	
	public WebelementUtils(WebDriver driver)
	{
		this.driver=driver;
		act=new Actions(this.driver);
	}
	public WebElement GetElement(By locator)
	{
		return driver.findElement(locator);
	}
	
	public  List<WebElement> getElements(By locator)
	{
		return driver.findElements(locator);
	}
	
	public  void doSendKeys(By locator,String value)
	{
		GetElement(locator).sendKeys(value);
	}
	
	public void doClick(By locator) {
		GetElement(locator).click();
	}
	
	public String doGetElementText(By locator)
	{
		return driver.findElement(locator).getText();
	}
	
	public boolean doIsDisplayed(By locator)
	{
		return driver.findElement(locator).isDisplayed();
	}
	
	
public  void doLinkClick(By locator,String value)
	
	{
        List<WebElement> langlinks = getElements(locator);
		
		System.out.println(langlinks.size());
		
		for(WebElement e:langlinks)
		{
			String txt=e.getText();
			System.out.println(txt);
			if(txt.equals(value))
			{
				e.click();
				break;
			}
		}
	}

//--------------------------------Select class-------------------------//

public  WebElement getElement(By locator)
{
	return driver.findElement(locator);
}

public  void doSelectByVisText(By locator,String value)
{
	Select select=new Select(getElement(locator));
	select.selectByVisibleText(value);	
}

public  void doSelectByIndex(By locator,int value)
{
	Select select=new Select(getElement(locator));
	select.selectByIndex(value);
}

public  void doSelectByValue(By locator,String value)
{
	Select select =new Select(getElement(locator));
	select.selectByValue(value);
}


public  void doSelectdropwithtext(By locator,String value)
{
	Select select=new Select(getElement(locator));
	List<WebElement> optionlist = select.getOptions();
	for(WebElement e:optionlist)
	{
		if(e.getText().equals(value))
		{
			e.click();
			break;
		}
	}
}



public void doSelectWithoutSelect(By locator,String value)
{
     List<WebElement> Induslist = getElements(locator);
	
	for(WebElement e:Induslist)
	{
		if(e.getText().equals(value))
		{
			e.click();
			break;
		}
	}
}

//-----------------------options Utls---------------------

public  List<WebElement> getOPtionslist(By locator)
{
	Select select=new Select(getElement(locator));
	
	List<String> optionlistText=new ArrayList<String>();
	
	List<WebElement> optionlist = select.getOptions();
	System.out.println(optionlist.size());
	
	for(WebElement e:optionlist)
	{
		optionlistText.add(e.getText());
	}
	return optionlist;
	
	
}

//-----------------------Action Class Move to element------------------------------
public  void doMovetoElement(By locator)
{ 
	   act.moveToElement(getElement(locator)).perform();
}


public void doActionsClick(By locator)
{
	 act.click(getElement(locator)).perform();
}

public void doActionSendKeys(By locator,String value)
{
	act.sendKeys(getElement(locator), value).perform();
}



//------------Alerts-----------------

public void doAcceptAlert()
{
	Alert alert = driver.switchTo().alert();
	
	alert.accept();
	driver.switchTo().defaultContent();
}

public String getAlertText()
{
	Alert alert = driver.switchTo().alert();
	return alert.getText();
}

//HashMap Login Details

public  void doLogin(String role,By un,By pw,By submit)
{
    String[] Cred = getCredentialMap(role).split(":");
    
	By EmailID = un;
	By Password=pw;
	By SIGNIN=submit;
	
	driver.findElement(EmailID).clear();
	driver.findElement(EmailID).sendKeys(Cred[0]);
	driver.findElement(Password).clear();
	driver.findElement(Password).sendKeys(Cred[1]);
	driver.findElement(SIGNIN).click();
}

public  String getCredentialMap(String role)
{
	Map<String, String> credmap=new HashMap<String,String>();
	credmap.put("Admin", "admin@test.com:test@123");
	credmap.put("Customer", "customer@test.com:test@124");
	credmap.put("Vendor", "vendor@test.com:test@126");
	credmap.put("Manager", "manager@test.com:test@128");
	credmap.put("Subrahmanya", "subrahmanya.adiga@symphonysummit.com:test@123");
	credmap.put("Manish", "manish.kk@symphonysummit.com:test@123");
	
	if(credmap.containsKey(role))
	{
		return credmap.get(role);
	}
	return null;
}


////********************WebDriver Wait*************************///

public WebElement waitforPresenceOfElement(By locator,int timout)
{
	WebDriverWait wait=new WebDriverWait(driver, 10);
	return wait.until(ExpectedConditions.presenceOfElementLocated(locator));
}


public Alert waitforAlerts(int timout)
{
	WebDriverWait wait=new WebDriverWait(driver, timout);
	return wait.until(ExpectedConditions.alertIsPresent());
}

public String getAlertText(int timout)
{
	return waitforAlerts(timout).getText();
}

public void acceptalert(int timout)
{
	waitforAlerts(timout).accept();
}

public void dissmissalert(int timout)
{
	waitforAlerts(timout).dismiss();
}

public String waitForTitle(String title,int timout)
{
	WebDriverWait wait=new WebDriverWait(driver, timout);
	
	wait.until(ExpectedConditions.titleContains(title));
	
	return driver.getTitle();
}

public WebElement waitVisibilityofElement(By locator,int timout)
{
	WebDriverWait wait=new WebDriverWait(driver, timout);
	return  wait.until(ExpectedConditions.visibilityOf(getElement(locator)));
	
}

public List<WebElement> waitForVisibilityofElements(By locator,int timout)
{
	WebDriverWait wait=new WebDriverWait(driver, timout);
   return wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(locator));
}


public Boolean waitForTexttoVisible(By locator,int timout,String value)
{
	WebDriverWait wait=new WebDriverWait(driver, timout);
	return wait.until(ExpectedConditions.textToBe(locator, value));
}

public WebDriver waitForFrameandSwitch(By locator,int timout)
{
	WebDriverWait wait=new WebDriverWait(driver, timout);
	return wait.until(ExpectedConditions.frameToBeAvailableAndSwitchToIt(locator));
}

}
