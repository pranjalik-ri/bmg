package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;

public class CheckoutPage extends BasePage
{
	WebDriver driver;
	public CheckoutPage (WebDriver driver)
	{
		super(driver);
	}
	//vhicle registration number
	//radio button-pickup/drop off or drive in
	//slottime-dropdown
	//radio button-payment post service or online payment.
	//confirm booking button
	@FindBy(xpath="//input[@name='vehicleNumber']") private WebElement vehicleNumber; // private WebElement SignIn=driver.fi
	@FindBy(xpath="(//button[@type='button'])[3]") private WebElement drivein ; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//select[@aria-hidden='true']") private WebElement slotime ; // private WebElement SignIn=driver.fi
	@FindBy(xpath="(//button[@type='button'])[6]") private WebElement paymentpostservice ; // private WebElement SignIn=driver.fi
	@FindBy(xpath="(//button[@type='button'])[7]") private WebElement paymentpostserviceonly ; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//button[text()='Confirm Booking']") private WebElement confirmbooking ; // private WebElement SignIn=driver.fi
	@FindBy(xpath="(//button[@type=\"button\"])[3]") private WebElement driveiIn ; // private WebElement SignIn=driver.fi

	
	
	
	public void Entervehiclenumber(String vehiclenumber) {
		vehicleNumber.sendKeys(vehiclenumber);
	}
	
    public void clickondriveIn() {
		
	       driveiIn.click();
		
	}
	public void selectSlottime() {
		
		
		Select s=new Select(slotime);
		s.selectByVisibleText("12pm - 3pm");
		
	}
	public void clickonpaymentpostservice() {
		paymentpostservice.click();
	}
	public void clickonpaymentpostserviceonly() {
		paymentpostserviceonly.click();
		
	}
	public void clickonconfirmbookingbutton() {
		confirmbooking.click();
		
	}
}
