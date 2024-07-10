package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BecomeServicePartnerPage extends BasePage

{
	WebDriver driver;

	public BecomeServicePartnerPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//input[@name='name']")private WebElement garageownername;
	@FindBy(xpath="//input[@type='email']")private WebElement emailid;
	@FindBy(xpath="//input[@type='number']")private WebElement mobilenumber;
	@FindBy(xpath="//input[@name='address']")private WebElement addressandnearbylandmark;
	@FindBy(xpath="//button[text()='Submit']")private WebElement submit;
	

public void entergarageownername(String garagename) throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		garageownername.sendKeys(garagename);
	}

public void enteremailid(String emailid1) throws InterruptedException 
{
	Thread.sleep(2000);
	emailid.sendKeys(emailid1);
}
public void entermobilenumber(String mobnum) throws InterruptedException {
	Thread.sleep(2000);
	mobilenumber.sendKeys(mobnum);
}
public void enteraddressandnearbylandmark(String address) throws InterruptedException 
{
	Thread.sleep(2000);
	addressandnearbylandmark.sendKeys(address);
}
public void clickonsubmitbutton() throws InterruptedException
{
	Thread.sleep(2000);
	submit.click();
	
}



}