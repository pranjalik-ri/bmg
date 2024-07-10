package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ServiceAddtoCart extends BasePage
{
	WebDriver driver;
	public ServiceAddtoCart (WebDriver driver)
	{
		super(driver);
	}
	//Step1: declaration 
	@FindBy(xpath="(//button[text()='Add to Cart'])[1]") private WebElement addToCart; // private WebElement SignIn=driver.fi
	//ndElement(By.xpath("//a[text()=’Sign in’]")); 
	@FindBy(xpath="//div[@class='relative text-xl text-red-500 cursor-pointer']") private WebElement addtocarticon; // private WebElement SignIn=driver.fi


	public void clickonAddtocartbutton() {
		addToCart.click();
	}
	public void clickonaddtocarticon() {
		addtocarticon.click();
	}
}
