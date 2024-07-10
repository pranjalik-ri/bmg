package testCases;

import org.testng.annotations.Test;

import pageObjects.ContactUsPage;
import pageObjects.HomePageLink;
import testBase.BaseClass;

public class TC_12_ContactUsPageTest extends BaseClass
{
	@Test
	public void TC_12_ContactUsPageTest() throws InterruptedException
	{
		HomePageLink hpk=new HomePageLink(driver);
		hpk.clickoncontactus();
		
	ContactUsPage cp=new ContactUsPage(driver);
	cp.entername("Pranjali");
	cp.entermobilenum("9403408748");
	cp.enteremailid("pranjaliramble@gmail.com");
	cp.entermessage("can you please provide information about services");
	cp.clickoncontactnowbutton();
	cp.verifycontactuspage();
}
}

