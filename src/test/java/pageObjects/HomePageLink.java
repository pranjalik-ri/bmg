package pageObjects;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePageLink extends BasePage
{
	WebDriver driver;

	public HomePageLink(WebDriver driver) {
		super(driver);
		// TODO Auto-generated constructor stub
	}
	
	@FindBy(xpath="//a[text()='Home']") private WebElement homelink; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//a[text()='About Us']") private WebElement aboutuslink; // private WebElement SignIn=driver.fi	@FindBy(xpath="//input[@placeholder='Mobile Number']") private WebElement becomeservicepartnerlink; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//a[text()='Become service partner']") private WebElement becomeservicepartnerlink; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//a[text()='Become a vendor']") private WebElement becomeavendorlink; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//a[text()='Pre Owned Car Dealers']") private WebElement preownedcardealerlink; // private WebElement SignIn=driver.fi
	@FindBy(xpath="//a[text()='Contact Us']") private WebElement contactus;
	@FindBy(xpath="//a[text()='Preventive Maintenance Package']") private WebElement preventivemaintaincepackagelink;
	@FindBy(xpath="//a[text()='Cool AC Service & Repair']") private WebElement coolacserviceandrepair;
	@FindBy(xpath="//a[text()='Battery Services']") private WebElement batteryservice;
	@FindBy(xpath="//a[text()='Wheels on Track']") private WebElement wheelsontrack;
	@FindBy(xpath="//a[text()='Shape & Color Restoration']") private WebElement shapeandcolorrestoration;
	@FindBy(xpath="//a[text()='Detailing Service Packages']") private WebElement detailingservicepackage;
	@FindBy(xpath="//a[text()='Beautify & Spa Cleaning Services']") private WebElement beautifyandspacleaningservice;
	@FindBy(xpath="//a[text()='Vehicle Inspection']") private WebElement vehicleinspection ;
	@FindBy(xpath="//a[text()='SOS Service']") private WebElement sosservice	;
	@FindBy(xpath="//a[@href=\"https://m.facebook.com/BookMyGarrageBMG\"]") private WebElement facebooklink;
	@FindBy(xpath="//a[@href=\"https://twitter.com/bookmygarrage\"]") private WebElement twitterlink;
	@FindBy(xpath="//a[@href=\"https://www.youtube.com/channel/UCERp-qCdbZ9QTXGfuLNY3Lg\"]") private WebElement youtubelink;
	@FindBy(xpath="//a[@href='https://www.linkedin.com/company/bookmygarrage/']") private WebElement linkedlnlink;
	@FindBy(xpath="//a[@href=\"https://www.instagram.com/bookmygarrage/\"]") private WebElement instagramlink;
	@FindBy(xpath="//a[text()='info@bookmygarrage.com']") private WebElement emaillink;
	@FindBy(xpath="//a[@href=\"tel:918686531818\"]") private WebElement mobilelink1;
	@FindBy(xpath="//a[@href=\"https://api.whatsapp.com/send?phone=919632533131\"][1]") private WebElement mobilelink2;


public void clickonlink() throws InterruptedException
{
	homelink.click();
}
public void clickonabouuslink() throws InterruptedException {
	
	Thread.sleep(4000);
	aboutuslink.click();
}
public void clickonbecomeservicepartnerlink() throws InterruptedException
	{Thread.sleep(4000);
	becomeservicepartnerlink.click();
	}
public void clickonbecomeavendorlink() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(4000);
	becomeavendorlink.click();
}

public void clickonpreownedcardealerlink() throws InterruptedException
{	Thread.sleep(4000);
	preownedcardealerlink.click();
	}
public void clickoncontactus() throws InterruptedException 
{
	Thread.sleep(4000);
	contactus.click();
}
public void clickonpreventivemaintaincepackagelink() throws InterruptedException
{
	Thread.sleep(4000);
	preventivemaintaincepackagelink.click();
}
public void clickoncoolacserviceandrepair() throws InterruptedException
{
	Thread.sleep(4000);
	coolacserviceandrepair.click();
}
public void clickonbatteryservice() throws InterruptedException
{
	Thread.sleep(4000);
	batteryservice.click();
}
public void clicckonwheelsontrack() throws InterruptedException
{
	Thread.sleep(4000);
	wheelsontrack.click();
}
public void clickonshapeandcolorrestoration() throws InterruptedException
{
	Thread.sleep(4000);
	shapeandcolorrestoration.click();
}
public void clickondetailingservicepackage() throws InterruptedException
{
	Thread.sleep(4000);
	detailingservicepackage.click();
}
public void clickonbeautifyandspacleaningservice() throws InterruptedException
{
	Thread.sleep(4000);
	beautifyandspacleaningservice.click();
}
public void clickonvehicleinspection() throws InterruptedException {
	Thread.sleep(4000);
	vehicleinspection.click();
}
public void clickonsosservice() throws InterruptedException
{
	Thread.sleep(4000);
	sosservice.click();
}
public void cliconfacebooklink() throws InterruptedException
{
	Thread.sleep(4000);
	facebooklink.click();
}
public void clickontwitterlink() throws InterruptedException
{
	Thread.sleep(4000);
	twitterlink.click();
}
public void clickonyoutubelink() throws InterruptedException
{
	Thread.sleep(4000);
	youtubelink.click();
}
public void clickonlinkedlnlink() throws InterruptedException
{
	Thread.sleep(4000);
	linkedlnlink.click();
}
public void clickoninstagramlink() throws InterruptedException
{
	Thread.sleep(4000);
	instagramlink.click();
}
public void clickonemaillink() throws InterruptedException
{
	Thread.sleep(4000);
	emaillink.click();
}
public void mobilelink1() throws InterruptedException
{
	Thread.sleep(4000);
	mobilelink1.click();
}
public void mobilelink2() throws InterruptedException
{
	Thread.sleep(4000);
	mobilelink2.click();
}
    

public void handleAlert() {
    try {
        // Switch to alert
        Alert alert = driver.switchTo().alert();

        // Get the text from the alert
//        String alertText = alert.getText();
//        System.out.println("Alert text is: " + alertText);
//
//        // Accept the alert
//        alert.accept();

        // Alternatively, to dismiss the alert
        alert.dismiss();

    } catch (Exception e) {
        System.out.println("No alert found");
        e.printStackTrace();
    }
}



}