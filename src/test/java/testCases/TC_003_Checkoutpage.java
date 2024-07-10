package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookaservicenowPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.VerificationPage;
import testBase.BaseClass;

public class TC_003_Checkoutpage extends BaseClass
{
	@Test(groups={"sanity","testng"})
	public void checkoutpage() throws InterruptedException 
	{
			
		logger.info("****** Starting TC_001_LoginTest **** ");
		logger.debug("application logs");
		
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
//		String confmsg=vp.getConfirmationMsg();
//		logger.info("validating expected message");
//		
//		if (confmsg.equals("Welcome Back!")) {
//			logger.info("test passed");
//			Assert.assertTrue(true);
//		}
//		else
//		{
//			logger.error("test failed");
//			Assert.fail();
//		}
//		
	
		BookaservicenowPage bp=new BookaservicenowPage(driver);
		Thread.sleep(2000);
		bp.Clickonselectcardropdown();
		Thread.sleep(2000);
		bp.Clickonselectedcar();
		Thread.sleep(5000);
		//bp.clickonBooknowbutton();
		}
		
	}	
}
		
	

