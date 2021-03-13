package DemoOpenCart;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class DemoCartRun {

	public static void main(String[] args) {
		
		By My_account = By.linkText("My Account");
		By Register = By.linkText("Register");
		By FirstName= By.id("input-firstname");
		By LastName= By.id("input-lastname");
		By Email= By.id("input-email");
		By Telephone= By.id("input-telephone");
		By Password= By.id("input-password");
		By ConfPassword= By.id("input-confirm");
		By YesNewsLetter= By.xpath("//*[@id=\"content\"]/form/fieldset[3]/div/div/label[1]/input");
		By IAgreeCheck= By.name("agree");
		By Continue= By.xpath("//*[@id=\"content\"]/form/div/div/input[2]");
		
		
		BrowserUtil br=new BrowserUtil();
		WebDriver driver = br.launchBrowser("EDGE");
		br.launchURL("https://demo.opencart.com/");
		
		ElementUtils ele=new ElementUtils(driver);
		
		ele.doClick(My_account);
		
		ele.doClick(Register);
		
		ele.doSendKeys(FirstName, "SUBRAHMANYA");
		
		ele.doSendKeys(LastName, "ADIGA");
		
		ele.doSendKeys(Email, "subbaadiga@test.com");
		
		ele.doSendKeys(Telephone, "9844708883");
		
		ele.doSendKeys(Password, "test@1234");
		ele.doSendKeys(ConfPassword, "test@1234");
		
		ele.doClick(YesNewsLetter);
		
		ele.doClick(IAgreeCheck);
		
		ele.doClick(Continue);
		
		String title=br.getPageTitle();
		System.out.println(title);
		br.closeBrowser();	
	
	}

}
