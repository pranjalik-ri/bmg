package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ContactUsPage extends BasePage

{

	WebDriver driver;
	public ContactUsPage(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	@FindBy(xpath="//input[@name='name']")private WebElement name;
	@FindBy(xpath="//input[@placeholder='Your Mobile Number']")private WebElement mobilenumber;

	@FindBy(xpath="//input[@placeholder='Your email id']")private WebElement emailid;
	@FindBy(xpath="//textarea[@placeholder='Type here']")private WebElement message;
	@FindBy(xpath="//button[text()='Contact Now']")private WebElement contactnow;
	@FindBy(xpath="//div[text()='Your request has been sent!']")private WebElement contactuspagemsg;



public void entername(String name1) 
{
	name.sendKeys(name1);
}
public void entermobilenum(String mobnum) 
{
	mobilenumber.sendKeys(mobnum);
}
public void enteremailid(String mail)
{
	emailid.sendKeys(mail);
}
public void entermessage(String msg)
{
	message.sendKeys(msg);
}
public void clickoncontactnowbutton() 
{
	contactnow.click();
}


public void verifycontactuspage() {
	// TODO Auto-generated method stub
	String actmsg=contactuspagemsg.getText();
	String exp="Your request has been sent!";
	if (actmsg.equals(exp)) 
	{
		System.out.println("pass");
	}
	else
	{
		System.out.println("fail");
	}
}
}

