package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.CheckoutPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.OurcarServicepage;
import pageObjects.Selectedservicespage;
import pageObjects.ServiceAddtoCart;
import pageObjects.VerificationPage;
import testBase.BaseClass;

public class TC_006_CheckoutPage extends BaseClass
{
	@Test(groups={"sanity","testng"})
	public void verify_checkoutpage() throws InterruptedException 
	{
			
		logger.info("****** Starting TC_006_CheckoutPage **** ");
		logger.debug("application logs");
		try
		{
			
		HomePage hp=new HomePage(driver);
		hp.clickonlogin();
		logger.info("Clicked on login");
		
		Thread.sleep(2000);
		LoginPage lp=new LoginPage(driver);
		lp.enterMobileNo("9403408748");
		logger.info("Enter mobile no");
		
		lp.btncontinue();
		logger.info("Clicked on continue");
		
		
		
		Thread.sleep(2000);
		VerificationPage vp=new VerificationPage(driver);
		vp.entonetimepassword("000000");
		logger.info("Enter otp no");
		
		vp.clickcontinue();
		logger.info("Clicked on continue");
		
		Thread.sleep(2000);
		String confmsg=vp.getConfirmationMsg();
		logger.info("validating expected message");
		
		if (confmsg.equals("Welcome Back!")) {
			logger.info("test passed");
			Assert.assertTrue(true);
		}
		else
		{
			logger.error("test failed");
			Assert.fail();
		}
		
	}catch (Exception e) 
		{
		logger.error("test failed");
		Assert.fail();
	}
		OurcarServicepage OSP=new OurcarServicepage(driver);
		OSP.ClickonBookNowbutton();
		Thread.sleep(2000);
		ServiceAddtoCart sac=new ServiceAddtoCart(driver);
		sac.clickonAddtocartbutton();
		sac.clickonaddtocarticon();
		Thread.sleep(2000);
		Selectedservicespage sp=new Selectedservicespage(driver);
		sp.Entervalidcoupon("SAVE5");
		
		sp.clickonapplybutton();
		//sp.clickonbmgwallet();
		sp.clickoncheckoutbutton();
		
		CheckoutPage cp=new CheckoutPage(driver);
		Thread.sleep(2000);
		cp.Entervehiclenumber("MH12Nh2345");
		Thread.sleep(2000);
		cp.clickondriveIn();
		Thread.sleep(2000);
		cp.selectSlottime();
		Thread.sleep(2000);
		cp.clickonpaymentpostservice();
		Thread.sleep(2000);
		cp.clickonpaymentpostserviceonly();
		Thread.sleep(2000);
        cp.clickonconfirmbookingbutton();
		
		logger.info("*****Finished TC_006_CheckoutPage*****");
	}
}
