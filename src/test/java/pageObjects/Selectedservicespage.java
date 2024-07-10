

package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Selectedservicespage extends BasePage
{
	WebDriver driver;
	public Selectedservicespage (WebDriver driver)
	{
		super(driver);
	}
	//Step1: declaration 
	//applycoupon field
	//applyreferrercode
	//bmgwalletcheckbox
	//checkout button
	@FindBy(xpath="//input[@placeholder='Apply coupon']") private WebElement applycoupon; // private WebElement SignIn=driver.fi
	//ndElement(By.xpath("//a[text()=’Sign in’]")); 
	@FindBy(xpath="(//button[text()='Apply'])[1]") private WebElement applybutton; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//input[@type='checkbox']") private WebElement bmgwalletcheckbox; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//button[text()=' Checkout']") private WebElement checkout; // private WebElement SignIn=driver.fi


	public void Entervalidcoupon(String coupon) {
		applycoupon.sendKeys(coupon);
	}
	public void clickonapplybutton()
	{
		applybutton.click();
	}
	public void clickonbmgwallet()
	{
		bmgwalletcheckbox.click();
		boolean result=bmgwalletcheckbox.isSelected();
		if (result ==true) 
		{ 
		System.out.println("checkbox is selectd"); 
		} 
		else 
		{ 
		System.out.println("checkbox is de-selectd"); 
		} 
	}
	public void clickoncheckoutbutton()
	{
		checkout.click();
	}
}
