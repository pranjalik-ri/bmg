package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OurcarServicepage extends BasePage
{
	WebDriver driver;
	public OurcarServicepage (WebDriver driver)
	{
		super(driver);
	}
	
	@FindBy(xpath="(//a[text()='Book Now'])[1]") private WebElement BookNowbutton;
    
	public void ClickonBookNowbutton() {
		BookNowbutton.click();
	}
}
