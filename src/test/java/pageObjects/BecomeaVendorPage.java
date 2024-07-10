package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BecomeaVendorPage extends BasePage
{
	WebDriver driver;

	public BecomeaVendorPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
   @FindBy(xpath="//input[@name='name']")private WebElement authorizedpersonname;
	@FindBy(xpath="//input[@type='email']") private WebElement emailid; 
	@FindBy(xpath="//input[@type='number']") private WebElement mobilenumber; 
	@FindBy(xpath="//input[@name='address']") private WebElement addressandnearbylandmark; 
	@FindBy(xpath="//button[text()='Save']") private WebElement savebutton; 
	@FindBy(xpath="//div[text()='Enquiry sent!.']") private WebElement vendorregistrationmsg; 
	
	public void enterauthorizedpersonname(String personname) 
	{
		authorizedpersonname.sendKeys(personname);
		        	                                                                                                                          
	}
	public void enteremailid(String mail) {
		emailid.sendKeys(mail);
	}
	public void entermobilenum(String mobnum)
	{
		mobilenumber.sendKeys(mobnum);
	}
	public void enteraddressandnearbylandmark(String address) {
		addressandnearbylandmark.sendKeys(address);
	}
	public void clickonsavebutton() {
		savebutton.click();
	}
	public void verifyvendorregistrationmsg() {
		String act=vendorregistrationmsg.getText();
		String exp="Enquiry sent!.";
		if(act.equals(exp)) 
		{
			System.out.println("pass");
		}
		else 
		{
			System.out.println("fail");
		}
	}
}
	
