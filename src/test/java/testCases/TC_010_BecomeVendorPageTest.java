package testCases;

import org.testng.annotations.Test;

import pageObjects.BecomeaVendorPage;
import pageObjects.HomePageLink;
import testBase.BaseClass;

public class TC_010_BecomeVendorPageTest extends BaseClass
{
	@Test
	public void TC_010_BecomeVendorPageTest() throws InterruptedException {
		HomePageLink hpk=new HomePageLink(driver);
		hpk.clickonbecomeavendorlink();
	BecomeaVendorPage bvp=new BecomeaVendorPage(driver);
	
	bvp.enterauthorizedpersonname("Pranjali");
	bvp.enteremailid("pranjalirkamble@gmail.com");
	bvp.entermobilenum("9403408748");
	bvp.enteraddressandnearbylandmark("Bengalure");
	bvp.clickonsavebutton();
	bvp.verifyvendorregistrationmsg();
}
}
