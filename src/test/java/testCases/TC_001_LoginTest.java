package testCases;


import java.time.Duration;

import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.HomePage;
import pageObjects.LoginPage;
import pageObjects.VerificationPage;
import testBase.BaseClass;

public class TC_001_LoginTest extends BaseClass
{
		@Test(groups={"sanity","testng"})
	public void verify_login_page() throws InterruptedException 
	{
			
		logger.info("****** Starting TC_001_LoginTest **** ");
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
		logger.info("*****Finished TC_001_LoginTest*****");
	}
	
	
}
