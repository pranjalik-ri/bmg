package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class PreownedCarDealersPage extends BasePage

{

	WebDriver driver;
	public PreownedCarDealersPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name='companyName']")private WebElement companyname;
	@FindBy(xpath="//input[@name='contactName']")private WebElement authorizedpersonname;
	@FindBy(xpath="//input[@name='email']")private WebElement emailid;
	@FindBy(xpath="//input[@name='mobile']")private WebElement mobilenumber;
	@FindBy(xpath="//input[@name='address']")private WebElement addressandnearbylandmark;
	@FindBy(xpath="//button[text()='Submit']")private WebElement submit;
	
	public void entercompanyname(String companyName) throws InterruptedException 
	{
		Thread.sleep(2000);
		companyname.sendKeys(companyName);
	}
   public void enterauthorizedpersonname(String personname) throws InterruptedException 
   {
	   Thread.sleep(2000);
	   authorizedpersonname.sendKeys(personname);
   }
   public void enteremailid(String email) throws InterruptedException {
	   Thread.sleep(2000);
	   emailid.sendKeys(email);
   }
   public void entermobilenumber(String mobnum) throws InterruptedException 
   {
	   Thread.sleep(2000);
	   mobilenumber.sendKeys(mobnum);
   }
   public void enteraddressandnearbylandmark(String address) throws InterruptedException {
	   Thread.sleep(2000);
	   addressandnearbylandmark.sendKeys(address);
   }
   public void clickonsubmit() throws InterruptedException 
   {
	   Thread.sleep(2000);
	   submit.click();
   }
}
