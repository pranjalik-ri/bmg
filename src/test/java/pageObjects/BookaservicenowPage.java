package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class BookaservicenowPage extends BasePage
{
	WebDriver driver;
	public BookaservicenowPage (WebDriver driver)
	{
		super(driver);
	}
	//Step1: declaration 
	@FindBy(xpath="//div[text()='Maruthi Suzuki']") private WebElement selectcar;
	//@FindBy(xpath="//button[@class=\"inline-flex items-center justify-center whitespace-nowrap rounded-md text-sm font-medium ring-offset-background transition-colors focus-visible:outline-none focus-visible:ring-2 focus-visible:ring-ring focus-visible:ring-offset-2 disabled:pointer-events-none disabled:opacity-50 bg-primary text-primary-foreground hover:bg-primary/90 h-10 px-4 py-2\"]") private WebElement choosecar;
	@FindBy(xpath="(//button[text()='Select'])[2]") private WebElement selectedcar;
    @FindBy(xpath="//button[text()='Book Now']") private WebElement booknow; // private WebElement SignIn=driver.fi
	//ndElement(By.xpath("//a[text()=’Sign in’]")); 

	public void Clickonselectcardropdown() {
		selectcar.click();
	}
//	public void Clickonselectchooseothercarbutton() {
//		choosecar.click();
//	}
	public void Clickonselectedcar()
	
	
	
	{
		selectedcar.click();
	}

//	public void clickonBooknowbutton() {
//		booknow.click();
//	}


}
