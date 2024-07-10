package testCases;

import org.testng.annotations.Test;

import pageObjects.BecomeServicePartnerPage;
import pageObjects.HomePageLink;
import testBase.BaseClass;

public class TC_009_BecomeServicePartnerTest extends BaseClass
{
	@Test
public void becomeservicepartner () throws InterruptedException 
	{
		HomePageLink hpk=new HomePageLink(driver);
		hpk.clickonbecomeservicepartnerlink();
		
		BecomeServicePartnerPage bsp=new BecomeServicePartnerPage(driver);
		bsp.entergarageownername("shashank");
		bsp.entermobilenumber("9403408748");
		bsp.enteraddressandnearbylandmark("Bengalure");
		bsp.clickonsubmitbutton();
		
 }
}
