package testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjects.BookaservicenowPage;
import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.VerificationPage;
import testBase.BaseClass;

public class TC_002_BookNowTest extends BaseClass
{
	@Test(groups={"sanity","testng"})
	
	public void booknowtest() throws InterruptedException 
	{
			
		logger.info("****** Starting TC_002_BookNowTest **** ");
		logger.debug("application logs");
		
			
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
		
		BookaservicenowPage bp=new BookaservicenowPage(driver);
		bp.Clickonselectcardropdown();
		//
		//bp.Clickonselectchooseothercarbutton();
		bp.Clickonselectedcar();
		Thread.sleep(2000);
		//bp.clickonBooknowbutton();
		
	}
}
	
	
		
	
	

