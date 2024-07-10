package testCases;

import org.testng.annotations.Test;

import pageObjects.HomePageLink;
import pageObjects.PreownedCarDealersPage;
import testBase.BaseClass;

public class TC_13_PreOwnedCarDealersPageTest extends BaseClass
{
	@Test
public void PreOwnedCarDealersPageTest() throws InterruptedException {
		HomePageLink hpk=new HomePageLink(driver);
		hpk.clickonpreownedcardealerlink();
		
		PreownedCarDealersPage pcp=new PreownedCarDealersPage(driver);
		pcp.enterauthorizedpersonname("Suresh");
		pcp.enteremailid("pranjalirkamble@gmail.com");
		pcp.entermobilenumber("9403408748");
		pcp.enteraddressandnearbylandmark("Bengalure");
		pcp.clickonsubmit();
}
}
