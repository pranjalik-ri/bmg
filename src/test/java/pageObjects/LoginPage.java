package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BasePage
{
	WebDriver driver;
	public LoginPage (WebDriver driver)
	{
		super(driver);
	}
	@FindBy(xpath="//input[@placeholder='Mobile Number']") private WebElement entmobilenumber; // private WebElement SignIn=driver.fi
	//ndElement(By.xpath("//a[text()=’Sign in’]"));
	@FindBy(xpath="//button[text()='Continue']") private WebElement btncontinue;
	
	public void enterMobileNo(String mob) {
		entmobilenumber.sendKeys(mob);
	}
	public void btncontinue() {
		btncontinue.click();
	}
	

}
