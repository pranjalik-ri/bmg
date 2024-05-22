package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class VerificationPage extends BasePage
{
	WebDriver driver;
	public VerificationPage (WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='One Time Password']") private WebElement entonetimepassword; 
	@FindBy(xpath="//button[text()='Continue']") private WebElement btncontinue2;
	@FindBy(xpath="//div[text()='Welcome Back!']") private WebElement msgconfirmation;



public void entonetimepassword(String zero)
{
	entonetimepassword.sendKeys(zero);
}
public void clickcontinue()
{
	btncontinue2.click();
}

public String getConfirmationMsg() 
{
	try {
		return(msgconfirmation.getText());
	}catch(Exception e) {
		return(e.getMessage());
	}
}
}